FROM java:8
FROM maven:3.6.0-jdk-11-slim AS build

WORKDIR /app/post-service

COPY . /app/post-service

RUN mvn clean install -DskipTests
#
ENTRYPOINT ["java", "-jar", "/app/post-service/target/PostService-0.0.1-SNAPSHOT.jar"]
