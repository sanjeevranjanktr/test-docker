package com.example.demospringrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demospringrestapi.entity.Student;
import com.example.demospringrestapi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/all")
	private ResponseEntity<List<Student>> getAllStu() {
		System.out.println("Hello Sir I am here..");
		return new ResponseEntity<>(service.getAllStudent(),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStu(@PathVariable long id, @RequestBody Student student) {
		System.out.println("here..");
		return new ResponseEntity<>(service.updateStu(id, student), HttpStatus.OK);

	}
}
