FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD mock.persistence.chat-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV mongo_server=10.0.3.24

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Deureka.client.serviceUrl.defaultZone=http://discovery:8761/eureka/ -Dspring.data.mongodb.uri=mongodb://${mongo_server}:27017/social-chat-db -Dspring.data.mongodb.host=${mongo_server} -jar /app.jar" ]