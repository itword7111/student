package com.example.student.service;

import com.example.student.entity.Student;

import java.util.Date;
import java.util.List;

public interface StudentService {
    void addStudent(String firstName, String lastName, String patronymic, String group, Date date);

    List<Student> getAllStudents();

    Student findStudent(int id);

    void editStudent(int id, String firstName, String lastName, String patronymic, String group, Date date);

    void deleteStudent(int id);
}
