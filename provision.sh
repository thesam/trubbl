#!/bin/bash
killall java
if [ ! -e /usr/bin/java ]; then
	aptitude update
	aptitude install -y default-jre
fi
