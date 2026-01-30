1. Why you used ArrayList instead of array?
A. The number of Students, Courses and Enrollment is not known upfront. Arrays are fixed-length so it becomes difficult 
   to manage them. ArrayList provides many built-in methods like add(), remove(), contains(), size() etc. which makes 
   it easier to implement.

2. Where you used static members and why?
A. Static members and member functions are used in IdGenerator.
   Static Member: studentIdCounter, courseIdCounter, enrollmentIdCounter
   Static Member Function: generateStudentId(), generateCourseId(), generateEnrollmentId()
   In the Student, Course and Enrollment classes, static members were used to maintain a unique ID for each instance. 
   This ensures that each Student, Course and Enrollment object has a distinct identifier without needing to pass it 
   during object creation.

3. Where you used inheritance and what you gained from it
A. Inheritance is used in the Person class which is the base class for Student class.
   The Person class contains common attributes like name and email, which are shared by all persons in the system.
   By inheriting from Person, the Student class can reuse these attributes and methods, reducing code duplication and 
   enhancing maintainability.
