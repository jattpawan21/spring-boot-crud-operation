package com.jsp.springbootcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrudoperation.dto.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
