# Learn-Track

A simple console-based learning management system (LMS) built to demonstrate Java OOP, clean code, and package structuring. It manages Students, Courses, and Enrollments, and includes services, utility classes, custom exceptions, and a console UI.

To compile, we use javac command which will create .class files. All these files are present in out/production/LearnTrack/com/airtribe/learntrack.
To run, we can use java command.

Directory Structure

src/
└── com/
└── airtribe/
└── learntrack/
├── Main.java // Menu & application
entry point
│
├── entity/
│ ├── Person.java
│ ├── Student.java
│ ├── Course.java
│ ├── Enrollment.java
| └── Trainer.java
│
├── repository/ // Data storage layer
(in-memory)
│ ├── StudentRepository.java
│ ├── CourseRepository.java
│ └── EnrollmentRepository.java
│
├── service/ // Business logic layer
│ ├── StudentService.java
│ ├── CourseService.java
│ └── EnrollmentService.java
│
├── exception/
│ ├── EntityNotFoundException.java
│ └── InvalidInputException.java // optional
│
├── util/
│ ├── IdGenerator.java
│ └── InputValidator.java
