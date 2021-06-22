package com.vm.dncRestDemo.student.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vm.dncRestDemo.students.entity.Student;


@Service
public class StudentService 
{
	List<Student> students;
	
	List<Student> createStudents()
	{
		students=new ArrayList<Student>();
		students.add(new Student(1,"aaa",1,80));
		students.add(new Student(2,"bbb",3,85));
		students.add(new Student(3,"ccc",5,90));
		students.add(new Student(4,"ddd",7,75));
		return students;
	}
	
	
	public List<Student> getStudents()
	{
		createStudents();
		return students;
	}


	public Student getStudentById(int id) {
		return students.stream().filter(s->s.getId() == id).findFirst().get();
	}

}