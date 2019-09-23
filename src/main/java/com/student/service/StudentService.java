package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	public void saveStudentObj(Student studentObj);

	public List<Student> getAllStudent();

	public Student getStudentObj(int theId);

	public void removeStudent(int theId);
	
	public void updateStudent(Student studentObj);
}
