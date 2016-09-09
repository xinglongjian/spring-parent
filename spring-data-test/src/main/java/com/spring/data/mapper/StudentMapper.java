package com.spring.data.mapper;

import java.util.List;

import com.spring.data.domain.Student;

public interface StudentMapper {

	List<Student> findAllStudents();
	
	Student findStudentById(Integer id);
	
	void insertStudent(Student student);
}
