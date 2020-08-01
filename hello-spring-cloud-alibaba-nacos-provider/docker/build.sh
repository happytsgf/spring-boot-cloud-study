#!/bin/bash
env=$1
app_name=$2
docker build -t 192.168.85.111/spring-cloud-alibaba/$app_name:$env .
docker push 192.168.85.111/spring-cloud-alibaba/$app_name:$env