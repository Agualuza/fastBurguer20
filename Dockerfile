FROM openjdk:17

LABEL key="postech/fastBurguer-1.0.0.jar"

WORKDIR /app

COPY target/fastBurguer-1.0.0.jar .

RUN chmod +x /app/fastBurguer-1.0.0.jar

ENTRYPOINT ["java", "-jar", "fastBurguer-1.0.0.jar"]

EXPOSE 9080