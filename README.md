# Healthcare Management Application

This is a healthcare management application built using Spring Boot and REST services. The application allows healthcare providers to manage patient records, schedule appointments, and prescribe medication. Additionally, it integrates with a third-party service, such as Google Maps, to provide directions to healthcare facilities.

## Features

- CRUD operations for managing patient records.
- Appointment scheduling functionality.
- Prescription management for medication.
- Integration with Google Maps API for providing directions to healthcare facilities.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- RESTful services
- H2 Database (for development)
- Google Maps API

## Prerequisites

- Java 11 or later installed on your machine.
- Maven installed on your machine.

## How to Run

1. Clone this repository to your local machine.

   ```
   git clone https://github.com/MarianaBP33/task3-hard
   ```

2. Navigate to project directory
   ```
   cd healthcare-management
   ```
3. Build the project using Maven

   ```
   mvn clean package
   ```

4. Run the springboot application

   ```
   java -jar target/healthcare-management-1.0.0-SNAPSHOT.jar

   ```

## Usage

- Use the provided REST endpoints to perform CRUD operations on patient records, schedule appointments, and manage prescriptions.
- For example, to fetch patient records, you can send a GET request to /patients.
- For appointment scheduling, you can send a POST request to /appointments with the necessary details in the request body.
- For medication prescription, you can send a POST request to /medications with the medication details in the request body.

## Configuration

For configuring the Google Maps integration, you need to obtain an API key from the Google Cloud Console and replace YOUR_API_KEY in the code with your actual API key.
