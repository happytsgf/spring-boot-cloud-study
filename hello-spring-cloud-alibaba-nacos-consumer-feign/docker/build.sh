#!/usr/bin/env bash
mvn package
#docker build -t NacosConsumerFeign:latest .
docker build -t 192.168.85.111/spring-cloud-alibaba/NacosConsumerFeign:latest .
docker push 192.168.85.111/spring-cloud-alibaba/NacosConsumerFeign:latest