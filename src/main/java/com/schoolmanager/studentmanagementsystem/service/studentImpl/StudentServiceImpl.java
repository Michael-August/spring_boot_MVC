package com.schoolmanager.studentmanagementsystem.service.studentImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.schoolmanager.studentmanagementsystem.model.Student;
import com.schoolmanager.studentmanagementsystem.repository.StudentRepository;
import com.schoolmanager.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);        
    }
    
}
