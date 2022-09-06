package com.schoolmanager.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolmanager.studentmanagementsystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
