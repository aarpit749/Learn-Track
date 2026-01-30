package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public void addStudent(String firstName, String lastName, String email, int batch) {
        int id = IdGenerator.getNextStudentId();
        Student student = new Student(id, firstName, lastName, email, batch, true);
        students.add(student);
    }

    public void addStudent(String firstName, String lastName, int batch) {
        int id = IdGenerator.getNextStudentId();
        Student student = new Student(id, firstName, lastName, batch, true);
        students.add(student);
    }

    public boolean removeStudent(int id){
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                return true;
            }
        }
        throw new EntityNotFoundException("Student with Id " + id + " not found.");
    }

    public boolean updateStudent(int id, String newEmail){
        for (Student s : students) {
            if (s.getId() == id) {
                s.setEmail(newEmail);
                return true;
            }
        }
        throw new EntityNotFoundException("Student with Id " + id + " not found.");
    }

    public List<Student> listStudents() {
        return students;
    }

    public Student searchStudent(int id){
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new EntityNotFoundException("Student with Id " + id + " not found.");
    }

    public boolean deactivateStudent(int id){
        for (Student s : students) {
            if (s.getId() == id) {
                s.setActive(false);
                return true;
            }
        }
        throw new EntityNotFoundException("Student with Id " + id + " not found.");
    }

    public void displayStudents(){

        if (students.isEmpty()) {
            throw new EntityNotFoundException("No Students found.");
        }
        System.out.printf("%n%-5s %-20s %-20s %-20s %-10s %10s%n", "ID", "FirstName", "LastName", "Email", "Batch","Active");
        System.out.println("----------------------------------------------------------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-5d %-20s %-20s %-20s %-10s %10s%n",
                    s.getId(), s.getFirstName(), s.getLastName(), s.getEmail(), s.getBatch(), s.getActive());
        }
    }
}
