# quantas
Instructions to build and run the project.  
1)Download and install maven (https://maven.apache.org/install.html)  
2)Download and install Java8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)  
3)Go to project root folder and build the project using the command "mvn clean install"  
4)Go to cdm-app folder and run the application using the command "mvn spring-boot:run"  
5)Open swagger json at "http://localhost:8080/cdm/v2/api-docs"  
6)Open swagger UI to see the API docs "http://localhost:8080/cdm/swagger-ui.html"   

Database:  
1) Document oriented NOSQL database like Solr can be used for persistence.   

How to add new data fields?  
1)Create a new field metadata using fieldmetadata API.   
2)Add the new field and its value in the customer create input request.   
3)Customer create service can validate the field and save the same in the database along with default fields.    

API Implementation:  
I have just created the API contract in this project but implementation can be done given sufficient time.    


