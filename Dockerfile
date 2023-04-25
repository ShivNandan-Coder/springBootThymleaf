FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/*.jar getpostdeleteApi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/getpostdeleteApi-0.0.1-SNAPSHOT.jar"]
