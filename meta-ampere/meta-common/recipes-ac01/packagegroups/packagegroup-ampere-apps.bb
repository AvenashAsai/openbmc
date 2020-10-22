SUMMARY = "OpenBMC for Ampere - Applications"
PR = "r1"

inherit packagegroup
inherit obmc-phosphor-utils

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-system \
        "

PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES_${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES_${PN}-system += "virtual-obmc-system-mgmt"

SUMMARY_${PN}-chassis = "Ampere Chassis"
RDEPENDS_${PN}-chassis = " \
	obmc-phosphor-buttons-signals \
	obmc-phosphor-buttons-handler \
	obmc-op-control-power \
        ampere-hostctrl \
        phosphor-hostlogger \
        phosphor-sel-logger \
        phosphor-logging \
        "
