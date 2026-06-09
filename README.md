# Hospital Management System

## Project Title
Hospital Management System

## Project Description

The Hospital Management System is a Java-based desktop application developed to simplify and automate hospital operations. The system provides an efficient way to maintain patient information digitally, reducing manual paperwork and improving data organization.

The application is developed using Java Swing for the Graphical User Interface (GUI) and JDBC for database connectivity with MySQL. It allows hospitals and clinics to manage patient records, doctor appointments, billing information, and medical records in a structured and secure manner.

This project demonstrates the implementation of Object-Oriented Programming concepts such as Inheritance, Collections, Exception Handling, Event Handling, and JDBC Connectivity.

---

## Features

- Patient Registration Module
- Doctor Appointment Booking
- Billing Management
- Medical Record Management
- MySQL Database Integration
- Java Swing Graphical User Interface
- JDBC Connectivity
- Exception Handling
- Object-Oriented Programming Concepts
- User-Friendly Interface

---

## Software Requirements

### Hardware Requirements

- Processor: Intel i3 or above
- RAM: 4 GB minimum (8 GB recommended)
- Storage: 500 MB free space
- Monitor: 1366 × 768 resolution or higher
- Keyboard and Mouse

### Software Requirements

- Operating System: Windows / Linux / macOS
- Java JDK 8 or above
- MySQL Database
- MySQL Connector/J
- Eclipse / IntelliJ IDEA / NetBeans / VS Code

---

## Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- Object-Oriented Programming (OOP)

---

## Database Setup

### Create Database

```sql
CREATE DATABASE hospitaldb;
USE hospitaldb;
```

### Create Patients Table

```sql
CREATE TABLE patients (
    patient_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    disease VARCHAR(100)
);
```

### Create Appointments Table

```sql
CREATE TABLE appointments (
    patient_id INT,
    doctor_name VARCHAR(50),
    appointment_date VARCHAR(30)
);
```

### Create Billing Table

```sql
CREATE TABLE billing (
    patient_id INT,
    amount DOUBLE
);
```

### Create Medical Records Table

```sql
CREATE TABLE records (
    patient_id INT,
    medical_record VARCHAR(200)
);
```

---

## Steps to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/Hospital-Management-System.git
```

### Step 2: Open the Project

Open the project in Eclipse, IntelliJ IDEA, NetBeans, or VS Code.

### Step 3: Create the Database

Create the MySQL database and tables using the SQL queries provided above.

### Step 4: Add MySQL JDBC Driver

Download MySQL Connector/J and add it to your project's build path.

### Step 5: Configure Database Connection

Update the database credentials in the source code:

```java
jdbc:mysql://localhost:3306/hospitaldb
Username: root
Password: your_password
```

### Step 6: Run the Application

Run the main Java file:

```java
HospitalManagementSystem.java
```

---

## Project Modules

### 1. Patient Registration Module

- Register new patients
- Store patient details
- Manage patient records

### 2. Appointment Module

- Book doctor appointments
- Store appointment details
- Manage consultation schedules

### 3. Billing Module

- Generate patient bills
- Store billing information
- Manage payment records

### 4. Medical Records Module

- Save patient medical history
- Retrieve medical records
- Maintain healthcare information

---

## OOP Concepts Used

- Classes and Objects
- Inheritance
- Polymorphism
- Collections (ArrayList)
- Exception Handling
- Event Handling
- JDBC Connectivity

---

## Future Enhancements

- Doctor Management Module
- Online Appointment Booking
- Admin Login Authentication
- Patient Login System
- Prescription Management
- Pharmacy Management
- Cloud Database Integration
- Email Notifications
- SMS Alerts
- Report Generation

---

## Project Outcome

The Hospital Management System successfully automates hospital operations such as patient registration, appointment scheduling, billing management, and medical record maintenance. The system improves efficiency, reduces manual errors, and provides secure data storage through MySQL database integration.

---

## License

This project is developed for academic and educational purposes.
