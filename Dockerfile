FROM openjdk:19
EXPOSE 8080
ADD target/tplims-project.jar tplims-project.jar
ENTRYPOINT ["java","-jar","/tplims-project.jar"]