package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Controller
public class ShowEmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/showEmployeeForm")
	public String showEmployeeForm() {
		return "showEmployeeForm.jsp";
	}
	
	@RequestMapping("/showEmployeeById")
	public ModelAndView showEmployeebyId(String empId) {
		ModelAndView mv = new ModelAndView("showEmployeeId.jsp");
		Employee employee = employeeDao.findById(empId).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
	
	
	//SearchByName
	@RequestMapping("/showEmployeeByName")
	public ModelAndView showEmployeebyName(String empFirstName) {
		ModelAndView mv1 = new ModelAndView("showEmployeeName.jsp");
		List<Employee> employee = employeeDao.findByEmpFirstName(empFirstName);
		for(Employee e : employee) {
			System.out.println("Employee Id:"+e.getEmpId()+"\n Employee Name:"+e.getEmpFirstName()+"\n");
		}
		mv1.addObject(employee);
		return mv1;
	}
	
}
