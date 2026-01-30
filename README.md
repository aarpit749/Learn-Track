# Learn-Track

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
