FROM java:8

ARG JAR_FILE=target/credit-card-service.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
