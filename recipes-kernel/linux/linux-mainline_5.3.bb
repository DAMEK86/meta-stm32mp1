require recipes-kernel/linux/linux-mainline-common.inc

LINUX_VERSION ?= "5.3.x"
KERNEL_VERSION_SANITY_SKIP="1"

BRANCH = "linux-5.3.y"
SRCREV = "${AUTOREV}"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=${BRANCH} \
"
