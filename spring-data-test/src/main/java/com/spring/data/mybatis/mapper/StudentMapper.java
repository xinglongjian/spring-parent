package com.spring.data.mybatis.mapper;

import java.util.List;

import com.spring.data.mybatis.domain.Student;

public interface StudentMapper {

	List<Student> findAllStudents();
	
	Student findStudentById(Integer id);
	
	void insertStudent(Student student);
}
