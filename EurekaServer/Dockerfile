FROM java:8
FROM maven:3.6.0-jdk-11-slim AS build

WORKDIR /app/spring-eureka-server
COPY . /app/spring-eureka-server

RUN mvn clean && mvn install
#
ENTRYPOINT ["java", "-jar", "/app/spring-eureka-server/target/EurekaServer-0.0.1-SNAPSHOT.jar"]