package com.student.dao;

import java.util.List;

import com.student.entity.Student;

public interface StudentDAO {

	public void saveStudentObj(Student studentObj);

	public List<Student> getAllStudent();
	
	public Student getStudentObj(int theId);
	
	public void removeStudent(int theId); 
	
	public void updateStudent(Student studentObj);

}
