# Introduction 
This is a small Spring Boot microservice demo which exposes a basic REST API.

# Getting Started
1.	Clone the Repository
2.	Import the code as Maven Project in your Editor (STS/Eclipse)
3.	Run Maven command - mvn clean package
4.	Run the Project as a Spring Boot Project or directly run class Application.java as a Java application.
5.  Optionally you can execute the Project from command line too once jar has been generated : java -jar target/greet-service.jar


# Build
1.	Run Maven command : *mvn clean package*
2.	Create a Docker Image : *docker build -t image-name:tag-name .*

# CI/CD
The Project is enabled with GITHub Actions CI-CD Workflow. Refer file .github/workflows/main.yml for details. The Workflow steps are:
```sh
- Clone the Code
- Setting up Java and cache to persist Maven Dependencies
- Compile the Code
- Test the Code
- Package the Code
- Build the Image and Push the Code to a Docker Registry
- Deploy the Code to a K8s or OpenShift Cluster
```
