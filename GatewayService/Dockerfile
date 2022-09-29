FROM java:8
FROM maven:3.6.0-jdk-11-slim AS build

WORKDIR /app/gateway-service
COPY . /app/gateway-service

RUN mvn clean && mvn install
#
ENTRYPOINT ["java", "-jar", "/app/gateway-service/target/GatewayService-0.0.1-SNAPSHOT.jar"]
