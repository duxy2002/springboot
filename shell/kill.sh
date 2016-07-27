#!/bin/sh
# kill -9 `ps -ef|grep 项目名称|awk '{print $2}'`
kill -9 `ps -ef|grep demo|awk '{print $2}'`