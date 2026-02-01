   # Hostel Room Allocation & Management System

This project demonstrates a complete Java Full Stack web application built using:

- Java Servlets & JSP (MVC architecture)
- JDBC & MySQL for database operations
- Session management and transaction handling
- Spring Boot + Hibernate (JPA) + REST API
- HTML, CSS and JavaScript frontend

 
---------------------------------------------------------------------

TECHNOLOGIES USED

Servlet/JSP Module
- Java Servlets
- JSP
- JDBC
- MySQL
- HTML
- Apache Tomcat
- MVC Architecture

Spring Boot Module
- Spring Boot
- Hibernate (JPA)
- REST API
- HTML, CSS, JavaScript (Fetch API)

---------------------------------------------------------------------

FEATURES IMPLEMENTED

- Admin Login using HTTP Session
- Add Students and Assign Rooms
- Room Capacity Validation to prevent overbooking
- Student Payment Tracking
- Foreign Key Relationships in database
- JDBC Transaction Management (commit, rollback)
- SQL Indexing for faster queries
- Servlet Filter for secure access
- REST API for student management using Spring Boot
- HTML/CSS/JS frontend consuming REST API

---------------------------------------------------------------------

DATABASE DESIGN

Tables used:
- rooms – room capacity & occupancy
- students – student details mapped to rooms
- payments – payment records

Run the file database.sql in MySQL before starting the project.

---------------------------------------------------------------------

PROJECT STRUCTURE

hostel-room-allocation-system
│
├── src  (Servlet & JSP application)
│   ├── DBConnection.java
│   ├── LoginServlet.java
│   ├── AddStudentServlet.java
│   ├── AllocateRoomServlet.java
│   ├── PaymentServlet.java
│   ├── ViewStudentsServlet.java
│   ├── AuthFilter.java
│   ├── login.jsp
│   ├── dashboard.jsp
│   └── students.jsp
│
├── springboot  (Spring Boot REST API)
│   ├── pom.xml
│   ├── StudentApiApplication.java
│   ├── Student.java
│   ├── StudentRepository.java
│   ├── StudentController.java
│   ├── application.properties
│   └── index.html
│
├── database.sql
└── README.md

---------------------------------------------------------------------

HOW TO RUN (Servlet/JSP Module)

1. Start MySQL and run database.sql
2. Copy project folder into Tomcat webapps
3. Start Tomcat server
4. Open browser:

http://localhost:8080/hostel-room-allocation-system

Login:
Username: admin
Password: admin

---------------------------------------------------------------------

HOW TO RUN (Spring Boot REST Module)

1. Open springboot folder as Maven project
2. Run StudentApiApplication.java
3. Open index.html in browser
4. Add student using REST API

---------------------------------------------------------------------

CONCEPTS DEMONSTRATED

- MVC Architecture
- JDBC Connectivity and Transactions
- Session Handling & Authentication
- Database Normalization and Foreign Keys
- Servlet Filters
- REST API development
- Hibernate (JPA) ORM
- Frontend integration with JavaScript Fetch API

---------------------------------------------------------------------

LEARNING OUTCOME

This project provides practical understanding of both classic Java web development and modern Spring Boot RESTful services integrated with a relational database.