package com.example.demospringrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demospringrestapi.entity.Student;

@Service
public class StudentService {

	//@Autowired
	//private StudentRepo repo;
	
	public List<Student> getAllStudent() {
		//return repo.findAll();
		List<Student> stuList = new ArrayList<>();
		Student stu = new Student();
		stu.setId(1);
		stu.setMarks(220L);
		stu.setName("Sanjeev");
		stuList.add(stu);
		return stuList;
		
	}
	
	public Student updateStu(long id , Student stu) {
		/*
		 * Optional<Student> stud = repo.findById(id); if(stud != null &&
		 * stud.isPresent()) { stud.get().setMarks(stu.getMarks());
		 * stud.get().setName(stu.getName()); } return repo.save(stud.get());
		 */
		return null;

	}
}
