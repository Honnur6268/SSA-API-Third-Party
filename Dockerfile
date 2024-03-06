FROM openjdk:17
MAINTAINER Honnur
COPY  target/ssa-api.jar  ssa-api.jar
EXPOSE 7000
ENTRYPOINT ["java", "-jar", "/ssa-api.jar"]