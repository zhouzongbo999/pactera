package com.tony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tony.model.Employee;
import com.tony.service.IEmployeeService;

@Controller
public class EmployeeCtrl {
	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value={"","/","/home"},produces=MediaType.APPLICATION_JSON_VALUE)
	public String home(){
		System.out.println("hello world");
		return "index";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee emp) {
		employeeService.addEmployee(emp);
		return "redirect:views/Message.jsp";
	}
	
	@RequestMapping("/getEmployees")
	public ModelAndView getEmployees() {
		List<Employee> list = employeeService.getEmployees();
		ModelAndView mav = new ModelAndView("GetEmps");
		mav.addObject("emps", list);
		return mav;
	}
	
	@RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}
