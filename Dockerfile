FROM openjdk:8-jdk-alpine
 
VOLUME /tmp

ARG JAR_FILE

ADD ${JAR_FILE} Customer-backend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Customer-backend-0.0.1-SNAPSHOT.jar"]