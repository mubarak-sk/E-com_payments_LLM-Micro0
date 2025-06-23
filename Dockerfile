# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set workdir in container
WORKDIR /app

# Copy JAR into container
COPY target/wcom-payment-1.0.0.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
