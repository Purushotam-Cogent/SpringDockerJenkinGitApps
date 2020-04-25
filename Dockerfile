FROM openjdk:8
EXPOSE 8080
ADD target/docker-springbootapps.jar docker-springbootapps.jar
ENTRYPOINT ["java","-jar","docker-springbootapps.jar"]