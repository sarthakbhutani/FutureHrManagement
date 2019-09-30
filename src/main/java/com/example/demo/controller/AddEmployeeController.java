package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Controller
public class AddEmployeeController {
	
	
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/addEmployeeForm")
	public String showAddEmployeeForm() {
		return "addEmployee.jsp";
	}
	
//	@RequestMapping("/homeQ")
//	public ModelAndView home(Employee employee) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("emp", employee);
//		mv.setViewName("addEmployee.jsp");
//		return mv;
//	}
//	
	
	@RequestMapping("/addEmployee")
	public String AddEmployee(Employee employee) {
		employeeDao.save(employee);
		return "addEmployee.jsp";
	}
	
	
}
