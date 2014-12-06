package com.tony.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeCtrl {
	@RequestMapping(value={"/","","/home"})
	public String home(){
		return "index.html";
	}
}
