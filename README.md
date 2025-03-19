# BRBANK

This project is responsible for the banking system of the BRBank.

## Pre-requirements
| Tool  | Version   |
|-------|-----------|
| Java  | 21        |
| Maven | 3 Wrapper |

## Installation

1. Clone the repository from GitHub: https://github.com/NayarBEP3/brbank
2. Sync the project with your IDE
3. Sync the dependencies with Maven
4. Run the project discovery-service
5. Run the project config-service
6. Run the project gateway-service
7. Run the project auth-service
8. Run the project user-service
9. Run the project credit-card-service

## Services

### Discovery Service
Eureka service where we can see the integration between the services.

| Key          | Value                                                  |
|--------------|--------------------------------------------------------|
| service name | discovery-service                                      |
| host         | localhost                                              |
| port         | 8761                                                   |
| git          | https://github.com/NayarBEP3/brbank.develop-config.git |

### Config Service
Service responsible for the configuration of the services.
This service connects to the repository and gets the configuration of the services.

| Key          | Value          |
|--------------|----------------|
| service name | config-service |
| host         | localhost      |
| port         | 9297           |

## Gateway Service
Service responsible for the gateway of the services.
This service connects to the authentication service and validates the authorization of the app token.

| Key          | Value       |
|--------------|-------------|
| service name | api-gateway |
| host         | localhost   |
| port         | 8080        |

## Auth Service
Service responsible for the authentication of the services.
This service connects to the user service and validates the user's credentials and creates the token.

| Key          | Value        |
|--------------|--------------|
| service name | auth-service |
| host         | localhost    |
| port         | 9001         |

## User Service
Service responsible for the user of the services.
This service connects to the database and get the user information.

| Key          | Value        |
|--------------|--------------|
| service name | user-service |
| host         | localhost    |
| port         | 9002         |

## Credit Card Service
Service responsible for the credit card of the services.
This service connects to the database and get the credit card information.

| Key          | Value               |
|--------------|---------------------|
| service name | credit-card-service |
| host         | localhost           |
| port         | 9003                |


## Important Dependencies

| GroupId                   | ArtifactId                                 | Version       |
|---------------------------|--------------------------------------------|---------------|
| org.springframework.boot  | spring-boot-starter-web                    | 3.4.3         | 
| org.springframework.boot  | spring-boot-starter-test                   | 3.4.3         |
| org.springframework.boot  | spring-boot-starter-data-jpa               | 3.4.3         |
| org.springframework.cloud | spring-cloud-dependencies                  | 2024.0.0      |
| org.springframework.cloud | spring-cloud-config-server                 | 2024.0.0      |  
| org.springframework.cloud | spring-cloud-starter-netflix-eureka-client | 2024.0.0      |
| org.springframework.cloud | spring-cloud-starter-netflix-eureka-server | 4.2.0         |
| org.springframework.cloud | spring-cloud-starter-gateway               | 2024.0.0      |
| org.springframework.cloud | spring-cloud-starter-netflix-hystrix       | 1.4.7.RELEASE |
| org.projectlombok         | lombok                                     | 1.18.36       |
| com.netflix.eureka        | eureka-client-jersey3                      | 2.0.4         |
| io.jsonwebtoken           | jjwt-api                                   | 0.11.5        |
| io.jsonwebtoken           | jjwt-impl                                  | 0.11.5        |
| io.jsonwebtoken           | jjwt-jackson                               | 0.11.5        |
| com.h2database            | h2                                         | 2.3.232       |
| org.mapstruct             | mapstruct                                  | 1.6.3         |
| org.mindrot               | jbcrypt                                    | 0.4           |