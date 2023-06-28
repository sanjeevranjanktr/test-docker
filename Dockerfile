FROM openjdk:8
EXPOSE 8080
ADD target/demo-spring-restapi-0.0.1-SNAPSHOT.jar demo-spring-restapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/demo-spring-restapi-0.0.1-SNAPSHOT.jar"]