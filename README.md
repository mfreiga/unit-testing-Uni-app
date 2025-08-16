# University Application Management — Unit Testing with JUnit

This project implements a simple university application management system and focuses on building **unit tests** with **JUnit** to ensure correctness of functionality.

---

The main objective is to:
- Implement basic features of a university application system (students, courses, applications, admissions)
- Apply **Test-Driven Development (TDD)** principles
- Write **JUnit tests** to validate core functionality
- Practice good testing design with coverage and edge cases

---

## Features

- **Core Classes**
  - `Student` – represents a student with id, name, and personal details
  - `Course` – represents a university course (code, name, credits)
  - `Application` – links a student to one or more course applications
  - `University` – central management for students, courses, and applications

- **Functionality**
  - Add and remove students
  - Add and remove courses
  - Submit applications for students
  - Retrieve application status
  - Enforce simple constraints (e.g., valid student ID, valid course)

- **Testing**
  - Comprehensive **JUnit tests** included under `src/test/java`
  - Covers:
    - Adding/removing students and courses
    - Submitting applications
    - Boundary conditions (duplicate entries, invalid IDs)
    - Expected exceptions

---

