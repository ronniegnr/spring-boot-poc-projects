# use with jdk 11 alpine base image
FROM adoptopenjdk/openjdk11:alpine-jre

# make a documentation that this service communicates via 8080 port
EXPOSE 8080

# refer application jar file in a variable
ARG JAR_FILE=build/libs/spring-boot-mysql-0.0.1-SNAPSHOT.jar

# change working diretory to /opt/app
WORKDIR /opt/app

# add the jar file to /opt/app
ADD ${JAR_FILE} app.jar

# run the jar file using java
ENTRYPOINT ["java", "-jar", "app.jar"]