package com.arpassion.springboot.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpassion.springboot.model.Greeting;
import com.arpassion.springboot.model.GreetingRepository;

@Service
public class DataLoader {


	private GreetingRepository greetingRepository;
	
	@Autowired
	public DataLoader(GreetingRepository greetingRepository){
		this.greetingRepository = greetingRepository;
				
	}
	
	@PostConstruct
	public void loadData(){
		
		Greeting greeting = new Greeting();
		greeting.setContent("CONTENT 123");
		greetingRepository.save(greeting);
		
		greeting = new Greeting();
		greeting.setContent("CONTENT 2456");
		greetingRepository.save(greeting);
		
		greeting = new Greeting();
		greeting.setContent("CONTENT 8999");
		greetingRepository.save(greeting);
		
		
		
	}
	
	
}
