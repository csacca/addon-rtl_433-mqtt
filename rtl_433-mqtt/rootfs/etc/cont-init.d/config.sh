#!/usr/bin/with-contenv bashio
# shellcheck shell=bash

# MQTT variables
declare host
declare port
declare username
declare password
declare retain

# rtl_433 variables
declare device
declare verbose
declare frequency

bashio::log.info "Collecting MQTT Settings..."

# TODO: Support configuration for mqtts (https://github.com/merbanan/rtl_433/issues/1633)
if ! bashio::services.available "mqtt"; then
    bashio::exit.nok "No internal MQTT service found and no MQTT server defined. Please install Mosquitto broker."
else
    bashio::log.info "MQTT service found, fetching server detail ..."

    host=$(bashio::services "mqtt" "host")
    port=$(bashio::services "mqtt" "port")

    bashio::log.info "Configuring mqtt server '${host}:${port}'"

    username=$(bashio::services "mqtt" "username")
    password=$(bashio::services "mqtt" "password")

    bashio::log.info "Configuring mqtt user '${username}'"

fi

retain=0

bashio::log.info "Generating rtl_433 configuration..."

if [ ! -d /etc/rtl_433 ]; then
    mkdir -p /etc/rtl_433
fi

i=1
for config in $(bashio::config 'devices|keys'); do
    bashio::log.info "Setting up device ${i}"

    bashio::config.require "devices[${config}].device"
    bashio::config.require "devices[${config}].verbose"
    bashio::config.require "devices[${config}].frequency"

    device=$(bashio::config "devices[${config}].device")
    verbose=$(bashio::config "devices[${config}].verbose")
    frequency=$(bashio::config "devices[${config}].frequency")

    bashio::var.json \
        host "${host}" \
        port "${port}" \
        username "${username}" \
        password "${password}" \
        retian "${retain}" \
        device "${device}" \
        verbose "${verbose}" \
        frequency "${frequency}" |
        tempio \
            -template /usr/share/tempio/rtl_433.gtpl \
            -out /etc/rtl_433/rtl_433_${i}.conf

    if [ ! -d /etc/services.d/rtl_433_${i} ]; then
        mkdir -p /etc/services.d/rtl_433_${i}
    fi

    if [ ! -d /addons/rlt_433-mqtt/rtl_433_${i} ]; then
        mkdir -p /addons/rlt_433-mqtt/rtl_433_${i}
    fi

    bashio::var.json \
        conf_file "/etc/rtl_433/rtl_433_${i}.conf" \
        log_dir "/addons/rlt_433-mqtt/rtl_433_${i}" |
        tempio \
        -template /usr/share/tempio/run.gtpl \
        -out /etc/services.d/rtl_433_${i}/run

    chmod a+rx /etc/services.d/rtl_433_${i}/run

    cp \
        /usr/share/tempio/finish \
        /etc/services.d/rtl_433_${i}/finish

    chmod a+rx /etc/services.d/rtl_433_${i}/finish

    ((i += 1))
done
