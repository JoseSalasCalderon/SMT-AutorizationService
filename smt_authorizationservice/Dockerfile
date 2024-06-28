# Etapa de construcción
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/smt_authorizationservice-0.0.1-SNAPSHOT.jar smt_authorizationservice.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "smt_authorizationservice.jar" ]