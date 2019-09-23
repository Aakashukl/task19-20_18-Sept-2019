package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDAO;
import com.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public void saveStudentObj(Student studentObj) {
		studentDAO.saveStudentObj(studentObj);
	}

	public List<Student> getAllStudent() {

		return studentDAO.getAllStudent();
	}

	public Student getStudentObj(int theId) {

		return studentDAO.getStudentObj(theId);
	}

	public void removeStudent(int theId) {
		studentDAO.removeStudent(theId);
	}

	public void updateStudent(Student studentObj) {
		studentDAO.updateStudent(studentObj);
	}

}
