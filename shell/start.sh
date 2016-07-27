#!/bin/sh

rm -f tpid

nohup java -jar /data/app/springboot.jar --spring.profiles.active=dev > /dev/null 2>&1 &

echo $! > tpid