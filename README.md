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

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/alpsahan/springboot-jwt-auth.git](https://github.com/alpsahan/springboot-jwt-auth.git)
   ```
2. Navigate to the project directory:
   ```bash
   cd springboot-jwt-auth
   ```
3. Configure your database:
Update your database configurations in the application.properties file.

4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
5. Access API Documentation:
Once the application is running, you can explore the endpoints via Swagger UI:
http://localhost:8080/swagger-ui/index.html




   
   
