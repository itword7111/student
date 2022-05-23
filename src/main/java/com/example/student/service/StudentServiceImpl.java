package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public void addStudent(String firstName, String lastName, String patronymic, String group, Date date) {
        repository.addStudent(firstName, lastName, patronymic, group, date);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    @Override
    public Student findStudent(int id) {
        return repository.findStudent(id);
    }

    @Override
    public void editStudent(int id, String firstName, String lastName, String patronymic, String group, Date date) {
        repository.editStudent(id, firstName, lastName, patronymic, group, date);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteStudent(id);
    }
}
