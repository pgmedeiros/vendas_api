FROM openjdk

WORKDIR /app

COPY target/loja-0.0.1-SNAPSHOT.jar /app/loja.jar

ENTRYPOINT ["java", "-jar", "loja.jar"]