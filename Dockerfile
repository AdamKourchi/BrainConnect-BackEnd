# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jre-slim  # You can change this to the version you're using

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY target/BrainConnect-001-snapshot.jar /app/app.jar

# Run the JAR file
CMD ["java", "-jar", "app.jar"]
