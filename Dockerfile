FROM java:8-jdk-alpine
COPY /target/springjpa-0.0.1-SNAPSHOT.jar /springjpa-app.jar
CMD ["java","-jar","springjpa.jar"]
