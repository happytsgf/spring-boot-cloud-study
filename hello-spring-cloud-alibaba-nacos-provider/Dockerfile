FROM 192.168.85.111/spring-cloud-alibaba/java-worker
#ADD target/hello-spring-cloud-alibaba-nacos-provider-1.0-SNAPSHOT.jar /root/worker/lib/worker-server.jar
COPY /target/hello-spring-cloud-alibaba-nacos-provider-1.0-SNAPSHOT.jar /NacosProvider.jar
ENV JAVA_OPTIONS "-Dfile.encoding=UTF-8 -Duser.language=zh -Duser.country=CN -Duser.timezone=UTC"
ENTRYPOINT ["java","-jar","/NacosProvider.jar"]