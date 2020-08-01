FROM 192.168.85.111/spring-cloud-alibaba/java-worker
ADD target/hello-spring-cloud-alibaba-nacos-provider-0.0.1-SNAPSHOT.jar /root/worker/lib/worker-server.jar
ENV JAVA_OPTIONS "-Dfile.encoding=UTF-8 -Duser.language=zh -Duser.country=CN -Duser.timezone=UTC"
EXPOSE 8080