
#!/usr/bin/with-contenv bashio
# ==============================================================================
# rtl_433 to MQTT hass.io addon
# Configures rtl_433
# ==============================================================================

readonly CONF=/etc/rtl_433.conf
declare verbose
declare host
declare port
declare username
declare password
declare topic
declare device
declare frequency

declare retain

# TODO: Support configuration for mqtts (https://github.com/merbanan/rtl_433/issues/1633)
if ! bashio::services.available "mqtt"; then
    bashio::exit.nok "No internal MQTT service found and no MQTT server defined. Please install Mosquitto broker."
else
    bashio::log.info "MQTT available, fetching server detail ..."
    
    host=$(bashio::services "mqtt" "host")
    port=$(bashio::services "mqtt" "port")

    bashio::log.info "Configuring mqtt server '${host}:${port}'"

    username=$(bashio::services "mqtt" "username")
    password=$(bashio::services "mqtt" "password")

    bashio::log.info "Configuring mqtt user '${username}'"

fi

verbose = $(bashio::config 'verbose')
device = $(bashio::config 'device')
frequency = $(bashio::config 'frequency')

retain = 0

(
    echo "## General"
    echo "verbose ${verbose}"
    echo "## Data output: MQTT"
    echo "output mqtt://${host}:${post},user=${username},pass=${password},retain=${retain}"
    echo ""
    echo "## Tuner options"
    echo "device ${device}"
    echo "frequency ${frequency}"
) >> /etc/rtl_433.conf
