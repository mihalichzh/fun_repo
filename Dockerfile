FROM openjdk:8u131-jdk-alpine

COPY /build/libs/*.jar .
RUN java -jar fun-1.0-SNAPSHOT-tests.jar -p myTests
