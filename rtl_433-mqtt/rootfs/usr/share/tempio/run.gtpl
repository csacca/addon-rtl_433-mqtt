#!/usr/bin/with-contenv bashio
# ==============================================================================
# rtl_433 to MQTT hass.io addon
# Runs rtl_433
# ==============================================================================

bashio::log.info "Starting rtl_433..."

exec /usr/local/bin/rtl_433 -d {{ .device }} -c {{ .conf_file }} -C si -M newmodel > >(tee -a {{ .log_dir }}/stdout.log) 2> >(tee -a {{ .log_dir }}/stderr.log >&2)