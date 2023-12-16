# Dockerfile,
FROM openjdk:17
RUN mkdir /usr/app/ 
COPY target/Quiz-Service-App.jar /usr/app
WORKDIR /usr/app/ 
ENTRYPOINT [ "java","-jar","Quiz-Service-App.jar" ]