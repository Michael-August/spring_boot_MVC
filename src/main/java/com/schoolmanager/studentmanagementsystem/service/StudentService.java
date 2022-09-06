package com.schoolmanager.studentmanagementsystem.service;

import java.util.List;

import com.schoolmanager.studentmanagementsystem.model.Student;

public interface StudentService {
    List<Student>  getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
