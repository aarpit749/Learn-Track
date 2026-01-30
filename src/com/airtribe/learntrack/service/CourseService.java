package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    List<Course> courses = new ArrayList<>();

    public void addCourse(String courseName, String description, int durationInWeeks) {
        int id = IdGenerator.getNextCourseId();
        Course c = new Course(id, courseName, description, durationInWeeks, true);
        courses.add(c);
    }

    public boolean activateDeactivateCourse(int id){
        for (Course c : courses) {
            if (c.getId() == id) {
                if (c.getActive()) {
                    c.setActive(false);
                    return true;
                }else {
                    c.setActive(true);
                    return true;
                }
            }
        }
        throw new EntityNotFoundException("Course with Id " + id + " not found.");
    }

    public List<Course> listCourses() {
        return courses;
    }

    public void displayCourse(){

        if (courses.isEmpty()) {
            throw new EntityNotFoundException("No Courses found.");
        }
        System.out.printf("%n%-5s %-30s %-30s %-10s %10s%n", "ID", "CourseName", "Description", "DurationInWeeks","Active");
        System.out.println("----------------------------------------------------------------------------------------------");

        for (Course s : courses) {
            System.out.printf("%-5d %-30s %-30s %-10s %10s%n",
                    s.getId(), s.getCourseName(), s.getDescription(), s.getDurationInWeeks(), s.getActive());
        }
    }
}
