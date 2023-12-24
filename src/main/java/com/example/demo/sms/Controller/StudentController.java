package com.example.demo.sms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.sms.Service.StudentService;

@Controller
public class StudentController {

	private StudentService sService;
	
	
	public StudentController(StudentService sService) {
		super();
		this.sService = sService;
	}


	@GetMapping("/students")
	public String ListStudent(Model model)
	{
		model.addAttribute("students",sService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/index_card")
	public String IndexCard(Model model)
	{
		model.addAttribute("card",sService.getAllStudents());
		return "index_card";
	}
	
	
}
