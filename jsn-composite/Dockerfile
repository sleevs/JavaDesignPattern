
FROM maven:3.8.6-openjdk-17 AS build


WORKDIR /app


COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests


FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY --from=build /app/target/jsn-composite-0.0.1-SNAPSHOT.jar jsn-composite.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "jsn-composite.jar"]