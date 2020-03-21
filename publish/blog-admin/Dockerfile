FROM openjdk:8
ADD blog-admin-2.2.2.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]