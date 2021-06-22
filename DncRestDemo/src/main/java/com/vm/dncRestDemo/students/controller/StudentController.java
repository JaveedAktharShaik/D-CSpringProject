package com.vm.dncRestDemo.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.dncRestDemo.student.service.StudentService;
import com.vm.dncRestDemo.students.entity.Student;

import java.util.List;


@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping("students")
	List<Student> getStudents()
	{
		return studentService.getStudents();
	}
	
	@RequestMapping("students/{id}")	
	Student getStudentById(@PathVariable("id") int id)
		{
			return studentService.getStudentById(id);
		}
	
	@GetMapping("/")
	public String home() {
		return ("<h1>welcome home</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user</h1>");
	}
	
}