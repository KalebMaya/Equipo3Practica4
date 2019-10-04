#Dockerfile
 
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/equipo3practica4cloudconfigserver-0.0.1-SNAPSHOT.jar equipo3practica4cloudconfigserver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/equipo3practica4cloudconfigserver-0.0.1-SNAPSHOT.jar"]