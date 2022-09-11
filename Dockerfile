FROM openjdk:11-jre-slim
ARG JAR_FILE=target/prueba_hospitales-1.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]