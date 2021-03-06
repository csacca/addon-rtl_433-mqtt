# config for rtl_433

## General
verbose {{ .verbose }}

## Data output: MQTT
output mqtt://{{ .host }}:{{ .port }},user={{ .username }},pass={{ .password }},retain={{ .retain }}

## Tuner options
# device {{ .device }}
frequency {{ .frequency }}

# Use "level" to add Modulation, Frequency, RSSI, SNR, and Noise meta data.
report_meta level

## Protocols to enable (command line option "-R")

protocol 1   # Silvercrest Remote Control
protocol 2   # Rubicson Temperature Sensor
protocol 3   # Prologue, FreeTec NC-7104, NC-7159-675 temperature sensor
protocol 4   # Waveman Switch Transmitter
# protocol 6   # ELV EM 1000
# protocol 7   # ELV WS 2000
protocol 8   # LaCrosse TX Temperature / Humidity Sensor
# protocol 10  # Acurite 896 Rain Gauge
protocol 11  # Acurite 609TXC Temperature and Humidity Sensor
protocol 12  # Oregon Scientific Weather Sensor
# protocol 13  # Mebus 433
# protocol 14  # Intertechno 433
protocol 15  # KlikAanKlikUit Wireless Switch
protocol 16  # AlectoV1 Weather Sensor (Alecto WS3500 WS4500 Ventus W155/W044 Oregon)
protocol 17  # Cardin S466-TX2
protocol 18  # Fine Offset Electronics, WH2, WH5, Telldus Temperature/Humidity/Rain Sensor
protocol 19  # Nexus, FreeTec NC-7345, NX-3980, Solight TE82S, TFA 30.3209 temperature/humidity sensor
protocol 20  # Ambient Weather, TFA 30.3208.02 temperature sensor
protocol 21  # Calibeur RF-104 Sensor
protocol 22  # X10 RF
protocol 23  # DSC Security Contact
# protocol 24  # Brennenstuhl RCS 2044
protocol 25  # Globaltronics GT-WT-02 Sensor
protocol 26  # Danfoss CFR Thermostat
protocol 29  # Chuango Security Technology
protocol 30  # Generic Remote SC226x EV1527
protocol 31  # TFA-Twin-Plus-30.3049, Conrad KW9010, Ea2 BL999
protocol 32  # Fine Offset Electronics WH1080/WH3080 Weather Station
protocol 33  # WT450, WT260H, WT405H
protocol 34  # LaCrosse WS-2310 / WS-3600 Weather Station
protocol 35  # Esperanza EWS
protocol 36  # Efergy e2 classic
# protocol 37  # Inovalley kw9015b, TFA Dostmann 30.3161 (Rain and temperature sensor)
protocol 38  # Generic temperature sensor 1
protocol 39  # WG-PB12V1 Temperature Sensor
protocol 40  # Acurite 592TXR Temp/Humidity, 5n1 Weather Station, 6045 Lightning, 3N1, Atlas
protocol 41  # Acurite 986 Refrigerator / Freezer Thermometer
protocol 42  # HIDEKI TS04 Temperature, Humidity, Wind and Rain Sensor
protocol 43  # Watchman Sonic / Apollo Ultrasonic / Beckett Rocket oil tank monitor
protocol 44  # CurrentCost Current Sensor
protocol 45  # emonTx OpenEnergyMonitor
protocol 46  # HT680 Remote control
protocol 47  # Conrad S3318P, FreeTec NC-5849-913 temperature humidity sensor
protocol 48  # Akhan 100F14 remote keyless entry
protocol 49  # Quhwa
protocol 50  # OSv1 Temperature Sensor
protocol 51  # Proove / Nexa / KlikAanKlikUit Wireless Switch
protocol 52  # Bresser Thermo-/Hygro-Sensor 3CH
protocol 53  # Springfield Temperature and Soil Moisture
protocol 54  # Oregon Scientific SL109H Remote Thermal Hygro Sensor
protocol 55  # Acurite 606TX Temperature Sensor
protocol 56  # TFA pool temperature sensor
protocol 57  # Kedsum Temperature & Humidity Sensor, Pearl NC-7415
protocol 58  # Blyss DC5-UK-WH
protocol 59  # Steelmate TPMS
protocol 60  # Schrader TPMS
# protocol 61  # LightwaveRF
# protocol 62  # Elro DB286A Doorbell
protocol 63  # Efergy Optical
# protocol 64  # Honda Car Key
protocol 67  # Radiohead ASK
protocol 68  # Kerui PIR / Contact Sensor
protocol 69  # Fine Offset WH1050 Weather Station
protocol 70  # Honeywell Door/Window Sensor, 2Gig DW10/DW11, RE208 repeater
protocol 71  # Maverick ET-732/733 BBQ Sensor
# protocol 72  # RF-tech
protocol 73  # LaCrosse TX141-Bv2, TX141TH-Bv2, TX141-Bv3, TX141W, TX145wsdth sensor
protocol 74  # Acurite 00275rm,00276rm Temp/Humidity with optional probe
protocol 75  # LaCrosse TX35DTH-IT, TFA Dostmann 30.3155 Temperature/Humidity sensor
protocol 76  # LaCrosse TX29IT, TFA Dostmann 30.3159.IT Temperature sensor
protocol 77  # Vaillant calorMatic VRT340f Central Heating Control
protocol 78  # Fine Offset Electronics, WH25, WH32B, WH24, WH65B, HP1000 Temperature/Humidity/Pressure Sensor
protocol 79  # Fine Offset Electronics, WH0530 Temperature/Rain Sensor
protocol 80  # IBIS beacon
protocol 81  # Oil Ultrasonic STANDARD FSK
protocol 82  # Citroen TPMS
protocol 83  # Oil Ultrasonic STANDARD ASK
protocol 84  # Thermopro TP11 Thermometer
protocol 85  # Solight TE44/TE66, EMOS E0107T, NX-6876-917
protocol 86  # Wireless Smoke and Heat Detector GS 558
protocol 87  # Generic wireless motion sensor
protocol 88  # Toyota TPMS
protocol 89  # Ford TPMS
protocol 90  # Renault TPMS
protocol 91  # inFactory, nor-tec, FreeTec NC-3982-913 temperature humidity sensor
protocol 92  # FT-004-B Temperature Sensor
protocol 93  # Ford Car Key
protocol 94  # Philips outdoor temperature sensor (type AJ3650)
protocol 95  # Schrader TPMS EG53MA4, PA66GF35
protocol 96  # Nexa
protocol 97  # Thermopro TP08/TP12/TP20 thermometer
protocol 98  # GE Color Effects
protocol 99  # X10 Security
protocol 100 # Interlogix GE UTC Security Devices
# protocol 101 # Dish remote 6.3
protocol 102 # SimpliSafe Home Security System (May require disabling automatic gain for KeyPad decodes)
protocol 103 # Sensible Living Mini-Plant Moisture Sensor
protocol 104 # Wireless M-Bus, Mode C&T, 100kbps (-f 868950000 -s 1200000)
protocol 105 # Wireless M-Bus, Mode S, 32.768kbps (-f 868300000 -s 1000000)
# protocol 106 # Wireless M-Bus, Mode R, 4.8kbps (-f 868330000)
# protocol 107 # Wireless M-Bus, Mode F, 2.4kbps
protocol 108 # Hyundai WS SENZOR Remote Temperature Sensor
protocol 109 # WT0124 Pool Thermometer
protocol 110 # PMV-107J (Toyota) TPMS
protocol 111 # Emos TTX201 Temperature Sensor
protocol 112 # Ambient Weather TX-8300 Temperature/Humidity Sensor
protocol 113 # Ambient Weather WH31E Thermo-Hygrometer Sensor, EcoWitt WH40 rain gauge
protocol 114 # Maverick et73
protocol 115 # Honeywell ActivLink, Wireless Doorbell
protocol 116 # Honeywell ActivLink, Wireless Doorbell (FSK)
# protocol 117 # ESA1000 / ESA2000 Energy Monitor
# protocol 118 # Biltema rain gauge
protocol 119 # Bresser Weather Center 5-in-1
# protocol 120 # Digitech XC-0324 temperature sensor
protocol 121 # Opus/Imagintronix XT300 Soil Moisture
# protocol 122 # FS20
# protocol 123 # Jansite TPMS Model TY02S
protocol 124 # LaCrosse/ELV/Conrad WS7000/WS2500 weather sensors
protocol 125 # TS-FT002 Wireless Ultrasonic Tank Liquid Level Meter With Temperature Sensor
protocol 126 # Companion WTR001 Temperature Sensor
protocol 127 # Ecowitt Wireless Outdoor Thermometer WH53/WH0280/WH0281A
protocol 128 # DirecTV RC66RX Remote Control
# protocol 129 # Eurochron temperature and humidity sensor
protocol 130 # IKEA Sparsnas Energy Meter Monitor
protocol 131 # Microchip HCS200 KeeLoq Hopping Encoder based remotes
protocol 132 # TFA Dostmann 30.3196 T/H outdoor sensor
protocol 133 # Rubicson 48659 Thermometer
protocol 134 # Holman Industries iWeather WS5029 weather station (newer PCM)
protocol 135 # Philips outdoor temperature sensor (type AJ7010)
protocol 136 # ESIC EMT7110 power meter
protocol 137 # Globaltronics QUIGG GT-TMBBQ-05
protocol 138 # Globaltronics GT-WT-03 Sensor
protocol 139 # Norgo NGE101
protocol 140 # Elantra2012 TPMS
protocol 141 # Auriol HG02832, HG05124A-DCF, Rubicson 48957 temperature/humidity sensor
protocol 142 # Fine Offset Electronics/ECOWITT WH51 Soil Moisture Sensor
protocol 143 # Holman Industries iWeather WS5029 weather station (older PWM)
protocol 144 # TBH weather sensor
protocol 145 # WS2032 weather station
protocol 146 # Auriol AFW2A1 temperature/humidity sensor
protocol 147 # TFA Drop Rain Gauge 30.3233.01
protocol 148 # DSC Security Contact (WS4945)
protocol 149 # ERT Standard Consumption Message (SCM)
# protocol 150 # Klimalogg
protocol 151 # Visonic powercode
protocol 152 # Eurochron EFTH-800 temperature and humidity sensor
protocol 153 # Cotech 36-7959 wireless weather station with USB
protocol 154 # Standard Consumption Message Plus (SCMplus)
protocol 155 # Fine Offset Electronics WH1080/WH3080 Weather Station (FSK)
protocol 156 # Abarth 124 Spider TPMS
protocol 157 # Missil ML0757 weather station
protocol 158 # Sharp SPC775 weather station
protocol 159 # Insteon
protocol 160 # ERT Interval Data Message (IDM)
protocol 161 # ERT Interval Data Message (IDM) for Net Meters
# protocol 162 # ThermoPro-TX2 temperature sensor
protocol 163 # Acurite 590TX Temperature with optional Humidity
protocol 164 # Security+ 2.0 (Keyfob)
protocol 165 # TFA Dostmann 30.3221.02 T/H Outdoor Sensor
protocol 166 # LaCrosse Technology View LTV-WSDTH01 Breeze Pro Wind Sensor
protocol 167 # Somfy RTS
protocol 168 # Schrader TPMS SMD3MA4 (Subaru)
# protocol 169 # Nice Flor-s remote control for gates
protocol 170 # LaCrosse Technology View LTV-WR1 Multi Sensor
protocol 171 # LaCrosse Technology View LTV-TH Thermo/Hygro Sensor
protocol 172 # Bresser Weather Center 6-in-1, 7-in-1 indoor, new 5-in-1, 3-in-1 wind gauge, Froggit WH6000, Ventus C8488A
protocol 173 # Bresser Weather Center 7-in-1
protocol 174 # EcoDHOME Smart Socket and MCEE Solar monitor
protocol 175 # LaCrosse Technology View LTV-R1 Rainfall Gauge
protocol 176 # BlueLine Power Monitor
protocol 177 # Burnhard BBQ thermometer
protocol 178 # Security+ (Keyfob)
protocol 179 # Cavius smoke, heat and water detector
protocol 180 # Jansite TPMS Model Solar
protocol 181 # Amazon Basics Meat Thermometer
protocol 182 # TFA Marbella Pool Thermometer
protocol 183 # Auriol AHFL temperature/humidity sensor
protocol 184 # Auriol AFT 77 B2 temperature sensor
protocol 185 # Honeywell CM921 Wireless Programmable Room Thermostat
protocol 186 # Hyundai TPMS (VDO)
# protocol 186 is highest supported by rtl_433 21.05