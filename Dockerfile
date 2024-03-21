FROM openjdk:21-jdk
ARG JAR_FILE=build/libs/api-test-service-0.0.3.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","/app.jar"]
