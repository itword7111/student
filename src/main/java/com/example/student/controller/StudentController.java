package com.example.student.controller;

import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;


@RestController
public class StudentController {
    private final StudentRepository studentService;
    @Autowired
    public StudentController(StudentRepository studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/student/mainPage")
    public ModelAndView mainPage(){
        return new ModelAndView("mainPage");
    }
    @RequestMapping("/student/findAllStudents")
    public ModelAndView getAllStudents(){
        ModelAndView model = new ModelAndView("allStudents");
        model.addObject("students", studentService.getAllStudents());
        return model;
    }
    @RequestMapping(value="/student/addStudent", method = RequestMethod.POST)
    public void addStudent(String firstName, String lastName, String patronymic, String group, Date date, HttpServletResponse response) throws IOException {
        studentService.addStudent(firstName,lastName,patronymic,group,date);
        response.sendRedirect(ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()+"/student/mainPage");
    }
    @RequestMapping(value="/student/addStudent", method = RequestMethod.GET)
    public ModelAndView getAddStudentForm() throws IOException {
        return new ModelAndView("addStudent");
    }
    @RequestMapping("/student/findStudent")
    public ModelAndView getFindStudentForm(){
        return new ModelAndView("findStudent");
    }
    @RequestMapping(value="/student/findStudent", method = RequestMethod.POST)
    public ModelAndView findStudent( int id, HttpServletResponse response) throws IOException {
        ModelAndView model = new ModelAndView("student");
        model.addObject("student", studentService.findStudent(id));
        return model;
    }
    @RequestMapping(value="/student/editStudent", method = RequestMethod.POST)
    public void editStudent( int id, String firstName, String lastName, String patronymic, String group, Date date, HttpServletResponse response) throws IOException {
        studentService.editStudent(id,firstName,lastName,patronymic,group,date);
        response.sendRedirect(ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()+"/student/mainPage");
    }
    @RequestMapping(value="/student/deleteStudent", method = RequestMethod.POST)
    public void deleteStudent(int id, HttpServletResponse response) throws IOException {
        studentService.deleteStudent(id);
        response.sendRedirect(ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()+"/student/mainPage");
    }
}
