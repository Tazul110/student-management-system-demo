package com.example.demo.sms.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.sms.MainClasses.Student;
import com.example.demo.sms.Repository.StudentRepository;
import com.example.demo.sms.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
 
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	 public List<Student> getAllStudents()
		{
			return studentRepository.findAll();
		}
	 
	 

}
