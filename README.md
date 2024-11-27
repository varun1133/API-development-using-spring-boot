# API-development-using-spring-boot
Here are the suggested instructions for the `README.md` file for your GitHub repository:

---

# Janitri Backend Assignment

## Overview
This project is a simplified backend system that manages devices monitoring patient heart rate data. It is developed using Spring Boot and exposes RESTful APIs for handling user, patient, and heart rate data management.

## Features
- User registration and login with email and password matching.
- Patient management: Add and retrieve patient details.
- Heart rate management: Record and retrieve heart rate data for patients.
- Secure and efficient data handling with validation and error handling.

## Prerequisites
To run the project locally, ensure you have the following installed:
- Java 11 or higher
- Maven (or Gradle, if used)
- MySQL (or any configured database)
- Git

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```
2. **Navigate to the project directory**:
   ```bash
   cd <project-directory>
   ```
3. **Configure the database**:
   - Update the `application.properties` or `application.yml` file with your database details.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Build the project**:
   ```bash
   mvn clean install
   ```
   or if using Gradle:
   ```bash
   ./gradlew build
   ```

5. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```
   or:
   ```bash
   java -jar target/your-application-name.jar
   ```

6. **Access the API**:
   The application will be running at [http://localhost:8080](http://localhost:8080).

## API Endpoints
### User Management
- **Register a User**
  - `POST /api/users/register`
  - Request Body:
    ```json
    {
      "email": "user@example.com",
      "password": "password123"
    }
    ```

- **Login**
  - `POST /api/users/login`
  - Request Body:
    ```json
    {
      "email": "user@example.com",
      "password": "password123"
    }
    ```

### Patient Management
- **Add a Patient**
  - `POST /api/patients`
  - Request Body:
    ```json
    {
      "name": "John Doe",
      "age": 30,
      "gender": "Male"
    }
    ```

- **Retrieve Patient Details**
  - `GET /api/patients/{id}`

### Heart Rate Management
- **Record Heart Rate**
  - `POST /api/heartrates`
  - Request Body:
    ```json
    {
      "patientId": 1,
      "heartRate": 75
    }
    ```

- **Retrieve Heart Rate Data**
  - `GET /api/heartrates/{patientId}`

## Assumptions and Decisions
- Email-password matching is used for user authentication without additional security protocols.
- Basic validation is implemented for data input.
- Relationships between users, patients, and heart rate data follow a simple relational model.

## API Documentation
API endpoints are self-documented using Swagger. Access it at:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


## Contact
For any questions or issues, please contact varungowda1103@gmail.com.

---
