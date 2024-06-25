FROM openjdk:17
EXPOSE 8083
ADD target/DockerImage.jar DockerImage.jar
ENTRYPOINT ["java","-jar","/DockerImage.jar"]


