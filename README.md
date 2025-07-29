# university-student-portal
A backend-focused University Student Portal built with Spring Boot, Oracle DB, and REST APIs.

# 🎓 University Student Portal (Backend)

A Spring Boot backend system simulating a University Student Portal where students can be enrolled in courses and queried for their academic data. Built with Oracle Database and REST APIs using Spring Boot, JPA, and layered architecture.

## 🔧 Tech Stack

- **Backend:** Java, Spring Boot (MVC, JPA)
- **Database:** Oracle DB
- **API Style:** RESTful
- **Tools:** Maven, JPA/Hibernate, Swagger (optional), Postman
- **Testing:** JUnit, Mockito (planned)
- **Version Control:** Git

---

## 🧩 Features

✅ Create and manage Students and Courses  
✅ Enroll Students into Courses  
✅ Retrieve Student → Course relationships  
✅ Exception handling with proper HTTP status codes  
✅ Modular and layered architecture (Controller → Service → Repository)  
✅ SQL scripts to auto-load test data on startup  

---

## 🗂️ Project Structure

student-portal/
├── controller/ # REST API Controllers
├── dto/ # Data Transfer Objects
├── entity/ # JPA Entities
├── repository/ # Spring Data JPA Repositories
├── service/ # Business Logic Layer
├── resources/
│ ├── application.properties
│ └── data.sql # Sample Data Initialization
└── StudentPortalApplication.java


---

## 🔄 API Endpoints

### Student
- `POST /api/students` – Add new student  
- `GET /api/students/{id}` – Get student by ID  

### Course
- `POST /api/courses` – Add new course  
- `GET /api/courses/{id}` – Get course by ID  

### Enrollment
- `POST /api/enrollments?studentId=3&courseId=101` – Enroll student to course  
- `GET /api/enrollments/student-courses?studentId=3` – Get all courses for a student  

---

## 💾 Sample Data (auto-loaded)

```sql
-- Students
INSERT INTO STUDENT (id, name, email) VALUES (1, 'John Doe', 'john@example.com');
INSERT INTO STUDENT (id, name, email) VALUES (2, 'Alice Smith', 'alice@example.com');
INSERT INTO STUDENT (id, name, email) VALUES (3, 'Gurkirat Singh', 'gurkirat.ca@gmail.com');

-- Courses
INSERT INTO COURSE (id, name) VALUES (101, 'Math 101');
INSERT INTO COURSE (id, name) VALUES (102, 'Physics 101');
INSERT INTO COURSE (id, name) VALUES (103, 'Engineering 101');
