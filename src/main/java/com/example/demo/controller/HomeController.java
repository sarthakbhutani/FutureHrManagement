package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;

@Controller
public class HomeController {

//	@ResponseBody
	@RequestMapping("/homeQ")
	public ModelAndView home(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("emp", employee);
		mv.setViewName("home.jsp");
		return mv;
	}
	
	@RequestMapping("/")
	public String defaultFn() {
		return "home.jsp";
	}
	
//	@RequestMapping("/error")
//	public String errorFn() {
//		return "error.jsp";
//	}
}
