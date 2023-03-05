package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class mainController {
	@RequestMapping("/home")
	public String firstHandler() {
		System.out.println("as");
		return "home.jsp";
	}
}
