package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.model.dao.EmpInfoDAO;

@Controller
@RequestMapping("/test")
public class Test {
	
//	@Autowired
//	EmpInfoDAO db;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
}
