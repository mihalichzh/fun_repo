FROM openjdk:8u131-jdk-alpine

COPY /build/libs/*.jar tests.jar
RUN java -jar tests -p myTests
