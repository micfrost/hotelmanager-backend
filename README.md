
# Hotelmanager Backend

This is a backend application for managing hotel rooms, built with Spring Boot.

## Features

- CRUD operations for hotel rooms
- Exception handling
- CORS configuration
- PostgreSQL database integration
- Validation for request parameters
- Automatic database seeding on application startup


## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Web
- PostgreSQL
- Maven


## Setup
1. **Clone the Repository:**   ```bash
   git clone https://github.com/your-username/hotelmanager-backend.git
2. Run the Application:**
- Navigate to the project directory and run:
3Database Setup:**
- Ensure PostgreSQL is installed and running.
- Create a database named `hotelmanager`.
- Update `application.properties` with your PostgreSQL username and password.



## Endpoints API
The application exposes the following REST endpoints:


| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addHotelzimmer**](DefaultApi.md#addHotelzimmer) | **POST** /api/hotelzimmer | POST api/hotelzimmer |
| [**deleteHotelzimmerById**](DefaultApi.md#deleteHotelzimmerById) | **DELETE** /api/hotelzimmer/{hotelzimmerId} | DELETE api/hotelzimmer/{hotelzimmerId} |
| [**findAll**](DefaultApi.md#findAll) | **GET** /api/hotelzimmer | GET api/hotelzimmer |
| [**getHotelzimmerById**](DefaultApi.md#getHotelzimmerById) | **GET** /api/hotelzimmer/{hotelzimmerId} | GET api/hotelzimmer/{hotelzimmerId} |
| [**updateHotelzimmer**](DefaultApi.md#updateHotelzimmer) | **PUT** /api/hotelzimmer | PUT api/hotelzimmer |



## Error Handling
The application provides detailed error responses for various exceptions such as room not found, invalid request parameters, etc.

## Configuration
- `application.properties` contains database configurations and Hibernate settings.
- CORS settings are configured in `GlobalCorsConfig`.

## Testing
- Unit and integration tests can be added under `src/test/java`.

## Author
Created by Michal Frost.

![Screenshot from 2024-04-10 23-22-19.png](src%2Fmain%2Fresources%2FImagesDemo%2FScreenshot%20from%202024-04-10%2023-22-19.png)
![Screenshot from 2024-04-10 23-22-24.png](src%2Fmain%2Fresources%2FImagesDemo%2FScreenshot%20from%202024-04-10%2023-22-24.png)

![Screenshot from 2024-04-11 10-23-08.png](src%2Fmain%2Fresources%2FImagesDemo%2FScreenshot%20from%202024-04-11%2010-23-08.png)


