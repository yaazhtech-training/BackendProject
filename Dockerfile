FROM openjdk:8
EXPOSE 8081
ADD target/tradeAnalysis-0.0.1-SNAPSHOT.jar tradeAnalysis-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/tradeAnalysis-0.0.1-SNAPSHOT.jar"]