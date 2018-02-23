# Use an official Java SDK runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory to /app
WORKDIR /app
 
VOLUME /tmp

ARG JAR_FILE

# Copy the current directory contents into the container at /app
ADD ${JAR_FILE} Customer-backend-0.0.1-SNAPSHOT.jar

# Define Entrypoint
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Customer-backend-0.0.1-SNAPSHOT.jar"]

# Install any needed packages specified in requirements.txt
# RUN pip install --trusted-host pypi.python.org -r requirements.txt

# Make port 80 available to the world outside this container
EXPOSE 80

# Define environment variable
ENV NAME World

# Run app.py when the container launches
# CMD ["python", "app.py"]