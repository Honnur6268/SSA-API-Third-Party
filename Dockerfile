FROM openjdk:17
MAINTAINER Honnur
COPY  target/ssa-api.jar  /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java", "-jar", "ssa-api.jar"]
EXPOSE 8080