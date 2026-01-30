package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    List<Enrollment> enrollments = new ArrayList<>();

    public void addEnrollment(int studentId, int courseId, int enrollmentDate) {
        int id = IdGenerator.getNextEnrollmentId();
        String status = "Enrolled";
        Enrollment enrollment = new Enrollment(id, studentId, courseId, enrollmentDate, status);
        enrollments.add(enrollment);
    }

    public List<Enrollment> listEnrollments() {
        return enrollments;
    }

    public void displayEnrollment(){

        if (enrollments.isEmpty()) {
            throw new EntityNotFoundException("No Enrollments found.");
        }
        System.out.printf("%n%-5s %-10s %-10s %-15s %20s%n", "ID", "StudentId", "CourseId", "EnrollmentDate","Status");
        System.out.println("----------------------------------------------------------------------------------------------");

        for (Enrollment s : enrollments) {
            System.out.printf("%-5d %-10s %-10s %-15s %20s%n",
                    s.getId(), s.getStudentId(), s.getCourseId(), s.getEnrollmentDate(), s.getStatus());
        }
    }

    public boolean updateEnrollmentStatus(int id, String newStatus){
        for (Enrollment e : enrollments) {
            if (e.getId() == id) {
                e.setStatus(newStatus);
                return true;
            }
        }
        throw new EntityNotFoundException("Enrolment with Id " + id + " not found.");
    }
}
