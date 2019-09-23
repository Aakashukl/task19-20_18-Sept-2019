package com.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student.entity.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("showAddForm")
	public ModelAndView showAddForm() {
		ModelAndView modelAndView = new ModelAndView("studentForm");
		Student studentObj = new Student();
		modelAndView.addObject("studentObj", studentObj);
		return modelAndView;
	}

	@RequestMapping("saveProcess")
	public ModelAndView checkData(@Valid @ModelAttribute("studentObj") Student student, BindingResult result) {
		// For Save the data into Database
		if(result.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("studentForm");
			return modelAndView;
		}
		else if (studentService.getStudentObj(student.getId()) == null) {
			studentService.saveStudentObj(student);

			// Show all the saved data
			ModelAndView modelAndView = new ModelAndView("ListStudents");
			List<Student> listOfStudents = studentService.getAllStudent();
			modelAndView.addObject("theStudents", listOfStudents);
			return modelAndView;
		}
		else {
			studentService.updateStudent(student);
			ModelAndView modelAndView = new ModelAndView("ListStudents");
			List<Student> listOfStudents = studentService.getAllStudent();
			modelAndView.addObject("theStudents", listOfStudents);
			return modelAndView;
		}
	}

	@RequestMapping("listStudent")
	public String getAllStudents(Model model) {

		List<Student> listOfStudents = studentService.getAllStudent();
		model.addAttribute("theStudents", listOfStudents);
		return "ListStudents";
	}

	@RequestMapping("updateRecord")
	public ModelAndView showUpdateForm(@RequestParam("studentId") int studentId) {
		ModelAndView modelAndView = new ModelAndView("studentForm");
		Student studentObj = studentService.getStudentObj(studentId);
		modelAndView.addObject("studentObj", studentObj);
		return modelAndView;
	}

	public Student findStudentById(int studentId) {
		Student student = studentService.getStudentObj(studentId);
		return student;
	}

	@RequestMapping("deleteRecord")
	public String deleteStudentObj(@RequestParam("studentId") int studentId) {
		studentService.removeStudent(studentId);
		return "redirect:/listStudent";
	}

}
