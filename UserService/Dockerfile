FROM java:8
FROM maven:3.6.0-jdk-11-slim AS build

WORKDIR /app/user-service

COPY . /app/user-service

RUN mvn clean install -DskipTests
#
ENTRYPOINT ["java", "-jar", "/app/user-service/target/UserService-0.0.1-SNAPSHOT.jar"]
