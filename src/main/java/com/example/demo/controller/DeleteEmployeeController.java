package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Controller
public class DeleteEmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/deleteEmployeeForm")
	public String showDeleteForm() {
		return "DeleteEmployeeForm.jsp";
	}
	
	
	@RequestMapping("/deleteEmployee")
	public String DeleteEmployee(String empId) {
		Optional<Employee> e = employeeDao.findById(empId);
		Optional<Employee> deletedE = e;
		employeeDao.deleteById(empId);
		return "employee with id : "+empId+ " deleted";
		
	}

}
