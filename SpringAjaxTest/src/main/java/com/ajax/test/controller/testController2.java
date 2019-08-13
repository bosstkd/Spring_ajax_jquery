package com.ajax.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class testController2 {

	
	
	

	@RequestMapping("/R_say_hello2")
	@ResponseBody
	public String helloWorld() {
		System.out.println("------------helloWorld------------");
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())+", Adresse: ElTarf 36000 actuellement.";
	}

}
