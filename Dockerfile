FROM openjdk:17

WORKDIR /app

COPY build/libs/shop.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
