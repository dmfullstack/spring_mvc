#base image
FROM openjdk:8-jdk-alpine
MAINTAINER Arman Fazylov <arman.fazylov@gmail.com>
#port app listens to (inside container)
EXPOSE 8069
#install Spring Boot artifact
VOLUME /tmp
ADD /target/senimchat.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
