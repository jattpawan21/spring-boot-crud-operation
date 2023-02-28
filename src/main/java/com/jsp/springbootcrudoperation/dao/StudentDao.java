package com.jsp.springbootcrudoperation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrudoperation.dto.Student;
import com.jsp.springbootcrudoperation.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository repository;
	
	//insertMethod
	public Student insertStudent(Student student)
	{
		return	repository.save(student);
	}
	
	//getById
	public int getById(int id)
	{
		Optional<Student> optional=repository.findById(id);
		
		if(optional.isPresent())
		{
			return optional.get().getId();
		}
		else
		{
			return 0;
		}
	}
	
	//deleteById
	public void deleteById(int id)
	{
		Optional<Student> optional=repository.findById(id);
		
		if(optional.isPresent())
		{
			Student student=optional.get();
			
			repository.delete(student);
		}
	}
	
	//updateById
	public void updateById(Student student,int id)
	{
		Optional<Student> optional=repository.findById(id);
		Student student2=optional.get();
		
		if(student.getName()!=null && student.getEmail()!=null)
		{
			student2.setName(student.getName());
			student2.setEmail(student.getEmail());
			
			repository.save(student2);
		}
		else if(student.getName()!=null)
		{
			student2.setName(student.getName());
			repository.save(student2);
		}
		else if(student.getEmail()!=null)
		{
			student2.setEmail(student.getEmail());
			
			repository.save(student2);
		}
	}
	
	//displayMethod
	public List<Student> displayAllStudent()
	{
		 return repository.findAll();
	}
}
