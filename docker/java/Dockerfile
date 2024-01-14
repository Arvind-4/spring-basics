FROM eclipse-temurin:21-jdk AS build

WORKDIR /app
COPY . .
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/* && \
    mvn clean package -Dmaven.test.skip=true


FROM eclipse-temurin:21-jre

WORKDIR /app
COPY --from=build /app/target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]