package com.raghab.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raghab.student.dal.entities.Student;
import com.raghab.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentDataApplicationTests {
	
	@Autowired
	private StudentRepository repo;

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("java COurse");
		student.setFee(500);
		repo.save(student);
	}
	
	

}
