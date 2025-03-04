# Use an official Maven image to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy project files
COPY . .

# Build the application
RUN mvn clean install

# Use a lightweight Java image for runtime
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy built JAR file from Maven build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 8080 (or change based on your application)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
