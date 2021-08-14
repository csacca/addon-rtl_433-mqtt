# addon-rtl_433-mqtt

rtl_433 to MQTT hass.io addon

Note: this addon requires home assistant have an MQTT service running. It will
autoconfigure the MQTT settings based on the installed server. For my installation
I had to add an ACL rule allowing the `addons` MQTT user to write topics.
