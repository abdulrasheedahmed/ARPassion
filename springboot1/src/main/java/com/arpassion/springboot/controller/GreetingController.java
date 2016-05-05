package com.arpassion.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arpassion.springboot.model.Greeting;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	public Greeting getData(){
		return new Greeting(1,"Hai, This is my first spring boot app");
	}
	
	@RequestMapping("/")
	public String hello(){
		return "Hai, This is my first spring boot app";
	}


}
