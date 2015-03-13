#!/bin/bash
if [ ! -e /usr/bin/java ]; then
	aptitude update
	aptitude install -y default-jre
fi
