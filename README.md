# **Trip Management Spring Boot Application**

This project is a Spring Boot Web MVC application designed to demonstrate key features of the Spring Framework, including dependency injection, RESTful endpoints, bean initialization, lazy loading, and more. The application provides a simple interface for trip management, where users can input their details and destination, and the system returns a status.

## **Table of Contents**

- [Features](#features)
- [Technologies](#technologies)
- [Endpoints](#endpoints)
- [Dependency Injection and Lazy Initialization](#dependency-injection-and-lazy-initialization)
- [Abstraction vs Inheritance](#abstraction-vs-inheritance)

---

## **Features**

This Spring Boot application demonstrates several important concepts:

1. **RESTful API Endpoints**: 
   - Provides two endpoints:
     - `/home`: Serves the index page.
     - `/pay`: Processes trip details with request parameters and returns a view.

2. **Thymeleaf View Rendering**: 
   - Uses Thymeleaf as the template engine to render dynamic HTML pages.

3. **Dependency Injection**: 
   - Illustrates field, setter, and constructor-based dependency injection.
   - Explains the use of `@Lazy` with `@Autowired` to manage the initialization of beans.

4. **Bean Initialization and Lazy Loading**: 
   - Demonstrates how beans can be lazily initialized and how Spring manages proxies for lazy beans.

5. **Inheritance and Abstraction**: 
   - Explains the differences between dependency injection in the context of inheritance and abstraction.

6. **Separation of Concerns**: 
   - Separates business logic from controllers using a well-organized service layer.

---

## **Technologies**

- **Java 17**: The project uses the latest LTS version of Java for improved performance and security.
- **Spring Boot 3.x**: Used to simplify Spring application configuration and management.
- **Spring MVC**: For creating RESTful web services and handling HTTP requests.
- **Thymeleaf**: A server-side Java template engine for dynamic web pages.
- **Maven**: Used for project dependency management and build.
- **JUnit 5**: For unit and integration testing.

---


## **Endpoints**

The application exposes the following HTTP endpoints:

1. **`GET /home`**:
   - Renders the `index.html` page, which contains a form for users to enter their full name and trip destination.

2. **`GET /pay?fn={fullName}&destination={destination}`**:
   - Processes the trip payment based on the full name and destination provided in the form.
   - Returns a `ModelAndView` with the form data (`fn` and `destination`) and the status of the payment, rendered by `display.html`.

---

## **Dependency Injection and Lazy Initialization**

### **Types of Dependency Injection**

- **Field Injection**: Dependencies are injected directly into the fields of a class.
- **Setter Injection**: Spring injects dependencies via setter methods.
- **Constructor Injection**: Dependencies are passed via the constructor, promoting immutability and testability.

### **Lazy Bean Initialization**

- **`@Lazy` Annotation**: Beans are only initialized when they are required, optimizing startup time.
- **Lazy Injection with `@Autowired`**: When a `@Lazy` bean is injected into another bean, Spring creates a proxy that delays initialization until a method is invoked.

Example behavior:
- A `LazyService` bean is initialized only when its method is first called, not at startup. The dependent bean (`DependentService`) injects `LazyService`, and Spring manages the proxying.

### **Bean Initialization Example:**

The application demonstrates:
- How lazy beans are proxied and only instantiated when accessed.
- How even dependent beans marked `@Lazy` can be delayed in their initialization until invoked.

---

## **Abstraction vs Inheritance**

### **Abstraction**

- The application uses abstraction to inject dependencies. Interfaces (`TripService`, `PaymentService`) are used to decouple the implementation from the dependent class. This promotes flexibility and better testability.
- Example: `TripServiceImpl` implements `TripService`, which can be injected into controllers, making the controller agnostic to the specific implementation.

### **Inheritance**

- The application also demonstrates dependency in the context of inheritance. A child class (`ElectricCar`) extends a parent class (`Car`) and can override behavior.
- Inheritance is typically more rigid than abstraction since a class is tightly coupled with its parent, whereas abstraction allows for greater flexibility.

---

Access the Application
Once the application is running, navigate to http://localhost:8080/home in your browser to access the trip form.

Fill in the form and submit to see the payment status for your trip.
You will be redirected to a page displaying your full name, destination, and the status of your payment.
