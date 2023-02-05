FROM openjdk:17
MAINTAINER Lester <lester.deeley@yahoo.com>
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar", "app.jar"]