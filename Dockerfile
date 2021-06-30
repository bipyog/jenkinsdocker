FROM openjdk:8
ADD target/docker-department-service.jar docker-department-service.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","docker-department-service.jar"]