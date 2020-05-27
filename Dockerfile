# builder
FROM maven:slim as builder
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY pom.xml /usr/src/app
COPY src /usr/src/app/src
RUN mvnw -B -DskipTests clean package

# deployer
FROM openjdk:8-slim
MAINTAINER cv
COPY --from=builder /usr/src/app/target/PatkaDevelopment-0.0.1-SNAPSHOT.jar /
ENV environment=dev
ENV PORT=8080

CMD ["java", "-Dspring.profiles.active=${environment}", "-Dserver.port=${PORT}", "-jar", "PatkaDevelopment-0.0.1-SNAPSHOT.jar"]