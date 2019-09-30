package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

// updateEmployeeSearchForm -> return searchForUpdate.jsp -> action : /updateEmployeePopulate :: -> /updateEmployeePopulate MV return a populatedForm.JSP -> action /submitUpdateEmployee -> /submitUpdateEmployee => PUT Request or save the dao

@Controller
public class UpdateEmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	private boolean exists;
	
	@RequestMapping("/updateEmployeeSearchForm")
	public String showEmployeeForm() {
		return "searchForUpdate.jsp";
	}
	
	@RequestMapping("/updateEmployeePopulate")
	public ModelAndView updateEmployeePopulate(String empId) {
		Boolean notFound;
		exists = employeeDao.existsById(empId);
		System.out.println("action : update ; ID: recieved \n");
		ModelAndView mv = new ModelAndView("populatedForm.jsp");
		if(exists) {
		//if NOT FOUND : ENABLE a SPAN STATEMENT
		Employee employee = employeeDao.findById(empId).orElse(new Employee());
		mv.addObject(employee);
		}
		else {
			notFound = true;
			mv.addObject(notFound);
		}
		return mv;
	}
	
	@RequestMapping("/submitUpdateEmployee")
	public ModelAndView submittingDetails(Employee employee) {
		ModelAndView mv1 = new ModelAndView("populatedForm.jsp");
		//update if else -> SPAN STATEMENT
		mv1.addObject(employee);
		employeeDao.save(employee);
		return mv1;
		
				
	}
}
