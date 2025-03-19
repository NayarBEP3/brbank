FROM openjdk:21-jdk
WORKDIR /app
COPY ./target/user-service-0.0.1-SNAPSHOT.jar .
EXPOSE 9002
CMD ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]