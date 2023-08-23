<br />
<div align="center">
<h3 align="center">Plazoleta de comidas</h3>
  <p align="center">
      Traceability Microservice
  </p>
</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
* ![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)
* MongoDB [https://www.mongodb.com/try/download/community](https://www.mongodb.com/try/download/community)

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation

1. Clone the repo
2. Change directory
   ```sh
   cd trazabilidad
   ```
3. Create a new database in Mongobd called traceability
4. Update the database connection settings 

   ```yml
   # src/main/resources/application.yml   
   spring:
      data:
         mongodb:
         host: localhost
         port: 27017
         database: traceability
   ```

<!-- USAGE -->
## Usage

1. Right-click the class PlazoletaApplication and choose Run
2. Open [http://localhost:8084/swagger-ui/index.html](http://localhost:8084/swagger-ui/index.html) in your web browser


