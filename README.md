# Spring Boot JWT Authentication System

This project is a backend application built with Spring Boot that provides secure JWT-based authentication and authorization. It follows clean architecture principles and demonstrates real-world backend development practices.

---

## 🚀 Technologies

- Java
- Spring Boot
- Spring Security
- PostgreSQL
- JWT (JSON Web Token)
- Swagger / OpenAPI

---

## 🔐 Features

- User registration and login
- JWT-based authentication
- Role-based authorization
- Refresh token mechanism
- Global exception handling
- RESTful API design
- API documentation with Swagger UI

---

## 📡 API Endpoints

### Authentication
- `POST /auth/register` → Register a new user  
- `POST /auth/login` → Authenticate user and receive JWT  

### Example Protected Endpoint
- Requires JWT token in Authorization header  

---

## 🧪 How to Run

1. Clone the repository:
```bash
git clone https://github.com/alpsahan/springboot-jwt-auth.git
```

2. Navigate to the project directory:
```bash
cd springboot-jwt-auth
```

3. Configure your database in application.properties
   
4. Run the application:
```bash
./mvnw spring-boot:run
```

📄 Swagger UI
After running the application, you can access API documentation via:
http://localhost:8080/swagger-ui/index.html
   










