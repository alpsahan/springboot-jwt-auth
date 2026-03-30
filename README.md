## 🔒 Features

* User registration and login
* JWT-based authentication
* Role-based authorization
* Refresh token mechanism
* Global exception handling
* RESTful API design
* API documentation with Swagger UI

---

## 🔌 API Endpoints

### Authentication
* `POST /auth/register` : Register a new user
* `POST /auth/login` : Authenticate user and receive JWT

### Example Protected Endpoint
* Requires JWT token in the `Authorization` header.

---

## 🚀 How to Run

## 🧪 How to Run

```bash
git clone https://github.com/alpsahan/springboot-jwt-auth.git
cd springboot-jwt-auth
./mvnw spring-boot:run
```
Configure your database in application.properties

📄 Swagger UI
http://localhost:8080/swagger-ui/index.html

