package com.airtribe.learntrack;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to LearnTrack!");
        StudentService s1 = new StudentService();
        CourseService c1 = new CourseService();
        EnrollmentService e1 = new EnrollmentService();
        try{
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Select one of the option from below:");
                System.out.println("1 to add new Student");
                System.out.println("2 to view all Students");
                System.out.println("3 to search Student by Id");
                System.out.println("4 to deactivate a Student by Id");
                System.out.println("5 to add new Course");
                System.out.println("6 to view all Courses");
                System.out.println("7 to Activate/Deactivate a Course by Id");
                System.out.println("8 to enroll a Student in a course");
                System.out.println("9 to view all enrollments");
                System.out.println("10 to update enrollment status by Enrollment Id");
                System.out.println("0 to exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1: {
                        System.out.println("Enter First Name:");
                        String firstName = sc.next();
                        System.out.println("Enter Last Name:");
                        String lastName = sc.next();
                        System.out.println("Enter Email:");
                        String email = sc.next();
                        System.out.println("Enter Batch:");
                        int batch = sc.nextInt();
                        s1.addStudent(firstName, lastName, email, batch);
                        System.out.println("Student added successfully!");
                        break;
                    }
                    case 2: {
                        s1.displayStudents();
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Student Id to search:");
                        int id = sc.nextInt();
                        Student student = s1.searchStudent(id);
                        if (student != null) {
                            System.out.println("Student Found: " + student.getDisplayName());
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Enter Student Id to deactivate:");
                        int id = sc.nextInt();
                        if(s1.deactivateStudent(id)) {
                            System.out.println("Student with Id " + id + " deactivated successfully.");
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("Enter Course Name:");
                        String courseName = sc.next();
                        System.out.println("Enter Description:");
                        String description = sc.next();
                        System.out.println("Enter Duration in Weeks:");
                        int durationInWeeks = sc.nextInt();
                        c1.addCourse(courseName, description, durationInWeeks);
                        System.out.println("Course added successfully!");
                        break;
                    }
                    case 6: {
                        c1.displayCourse();
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Course Id to Activate/Deactivate:");
                        int id = sc.nextInt();
                        if(c1.activateDeactivateCourse(id)){
                            System.out.println("Course with Id " + id + " status changed successfully.");
                        }
                        break;
                    }
                    case 8: {
                        System.out.println("Enter Student Id to enroll:");
                        int studentId = sc.nextInt();
                        System.out.println("Enter Course Id to enroll in:");
                        int courseId = sc.nextInt();
                        System.out.println(" Enter Enrollment Date (YYYYMMDD):");
                        int enrollmentDate = sc.nextInt();
                        e1.addEnrollment(studentId, courseId, enrollmentDate);
                        System.out.println("Student enrolled added successfully!");
                        break;
                    }
                    case 9: {
                        e1.displayEnrollment();
                        break;
                    }
                    case 10: {
                        System.out.println("Enter Enrollment Id to update status:");
                        int id = sc.nextInt();
                        System.out.println("Enter new status (Enrolled/Completed/Cancelled):");
                        String newStatus = sc.next();
                        if(e1.updateEnrollmentStatus(id, newStatus)) {
                            System.out.println("Enrollment status updated successfully.");
                        }
                        break;
                    }
                    case 0: {
                        System.out.println("Exiting LearnTrack. Goodbye!");
                        System.exit(0);
                    }
                    default: {
                        System.out.println("You entered the wrong choice. Try again.");
                        break;
                    }
                }

            }
        } catch (EntityNotFoundException e ){
            System.out.println("[NOT FOUND] " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}