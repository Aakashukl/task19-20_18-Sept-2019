package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveStudentObj(Student studentObj) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(studentObj);
		transaction.commit();
		session.close();
	}

	public List<Student> getAllStudent() {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> allStudentList = criteria.list();
		session.close();
		return allStudentList;
	}

	public Student getStudentObj(int theId) {

		Session session = sessionFactory.openSession();
		Student studentObj = session.get(Student.class, theId);
		session.close();
		return studentObj;
	}

	public void removeStudent(int theId) {
		Session session = sessionFactory.openSession();
		//Student studentObj = session.get(Student.class, theId);
		Student studentObj  = new Student();
		studentObj.setId(theId);
		Transaction transaction = session.beginTransaction();
		session.delete(studentObj);
		transaction.commit();
		session.close();
	}

	public void updateStudent(Student studentObj) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(studentObj);
		transaction.commit();
		session.close();
	}

}
