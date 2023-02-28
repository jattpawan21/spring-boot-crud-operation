package com.jsp.springbootcrudoperation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrudoperation.dto.Student;
import com.jsp.springbootcrudoperation.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	//insertMethod
	@PostMapping("/saveStudent")
	public Student insertStudent(@RequestBody Student student)
	{
		return	service.insertStudent(student);
	}
	
	//getById
	@GetMapping("/getStudentId/{id}")
	public int getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	//deleteById
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id)
	{
		return service.deleteById(id);
	}
	
	//updateById
	@PutMapping("/updateMapping/{id}")
	public String updateById(@RequestBody Student student,@PathVariable int id)
	{             
		return service.updateById(student, id);
	}
	
	//displayMethod
	@GetMapping("/displayAll")
	public List<Student> displayAllStudent()
	{
		return service.displayAllStudent();
	}
}
