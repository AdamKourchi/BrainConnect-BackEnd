# Use an official Java runtime as a parent image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the source code to the container (this includes the pom.xml, src, etc.)
COPY . /app

# Build the project using Maven (this will generate the .jar file in the target folder)
RUN mvn clean package -DskipTests

# Specify the command to run the .jar file
CMD ["java", "-jar", "target/BrainConnect-001-snapshot-.jar"]
