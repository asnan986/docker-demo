FROM openjdk:8
EXPOSE 8080
ADD target/docker-demo-jenkin.jar docker-demo-jenkin.jar
ENTRYPOINT ["java","-jar","docker-demo.jar"]