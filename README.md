# HelloWorldController

Welcome to the **HelloWorldController** project, a Maven-based Spring Boot application designed to demonstrate simple RESTful web services. This project offers two endpoints that return personalized greeting messages in plain text.

## Overview

This project includes a `HelloWorldController` class, annotated with `@RestController` and `@RequestMapping` to handle HTTP requests and produce text/plain responses. The controller provides two endpoints:

1. **GET /HelloWorld**: Returns a greeting message, optionally personalized with a query parameter.
2. **GET /HelloWorld2/{nom}**: Returns a greeting message personalized with a path variable.

## Endpoints

### GET /HelloWorld

Returns a greeting message. If a name is provided as a query parameter, it will be included in the greeting. Otherwise, "UNKNOWN" will be used.

**Request Example:**

```bash
curl -X GET "http://localhost:9001/HelloWorld?nom=John"
```

**Response Example:**

```
Hola, John. Estàs executant un projecte Maven
```

If no name is provided:

```bash
curl -X GET "http://localhost:9001/HelloWorld"
```

**Response Example:**

```
Hola, UNKNOWN. Estàs executant un projecte Maven
```

### GET /HelloWorld2/{nom}

Returns a greeting message with the name provided as a path variable.

**Request Example:**

```bash
curl -X GET "http://localhost:9001/HelloWorld2/John"
```

**Response Example:**

```
Hola, John. Estàs executant un projecte Maven
```

## Source Information

The implementation of this controller and the usage of Spring Boot annotations and methods were guided by the following sources:

- **Book:** "Spring in Action" by Craig Walls, ISBN 9781617294945
- **Website:** [Baeldung - Spring @RequestParam Annotation](https://www.baeldung.com/spring-request-param)
