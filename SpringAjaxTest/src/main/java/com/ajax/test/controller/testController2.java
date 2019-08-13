package com.ajax.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.growl.cls.message;

@Controller
@RequestMapping("/")
public class testController2 {

	
	
	

	@RequestMapping("/R_say_hello2")
	@ResponseBody
	public String helloWorld() {
		System.out.println("------------hello Lylia without Growl------------");
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())+", Adresse: ElTarf 36000 actuellement.";
	}
	
	@RequestMapping("/G_say_growl")
	@ResponseBody
	public String helloWorldGrowl() {
		System.out.println("------------Hello with Growl------------");
		message msg = new message();
		msg.setTitre("test Bonjour :");
		msg.setMsg(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())+", Hey show date.");
		return  msg.notice();
	}
	
	
}
