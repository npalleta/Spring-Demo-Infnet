FROM openjdk:17-jdk-slim-buster
LABEL mentainer="palleta.sp@gmail.com"
WORKDIR /app
COPY target/SpringDemo-0.0.1-SNAPSHOT.jar /app/spring-demo.jar
ENTRYPOINT ["java", "-jar", "spring-demo.jar"]