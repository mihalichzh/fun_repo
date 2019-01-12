FROM alpine:3.7
#COPY ./build/libs /test_jar
#WORKDIR /test_jar
CMD ["mkdir", "folder_in_docker"]
#CMD ["java", "-jar", "fun-1.0-SNAPSHOT-tests.jar","-p", "myTests"]