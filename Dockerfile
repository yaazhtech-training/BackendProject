FROM openjdk:8
EXPOSE 8081
ADD target/test-demo-0.0.1-SNAPSHOT.jar cicd-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/test/demo-0.0.1-SNAPSHOT.jar"]