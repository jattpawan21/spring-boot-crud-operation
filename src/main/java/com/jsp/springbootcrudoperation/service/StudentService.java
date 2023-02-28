package com.jsp.springbootcrudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.jsp.springbootcrudoperation.dao.StudentDao;
import com.jsp.springbootcrudoperation.dto.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	//insertMethod
	public Student insertStudent(Student student)
	{
		return	dao.insertStudent(student);
	}
	
	//getById
	public int getById(int id)
	{
		return dao.getById(id);
	}
	
	//deleteById
	public String deleteById(int id)
	{
		if(dao.getById(id)!=0)
		{
			dao.deleteById(id);
			
			return "Data is deleted...........";
		}
		else
		{
			return "Given id is not present....";
		}
	}
	
	//updateById
	public String updateById(Student student,int id)
	{
		if(dao.getById(id)!=0)
		{
			dao.updateById(student, id);
			
			return "Data is updated...........";
		}
		else
		{
			return "Given id is not deleted....";
		}
	}
	
	//displayMethod
	public List<Student> displayAllStudent()
	{
		return dao.displayAllStudent();
	}
}

