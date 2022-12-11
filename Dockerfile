FROM openjdk:17

COPY target/products-1.jar products-1.jar

ENTRYPOINT ["java", "-jar", "/products-1.jar"]