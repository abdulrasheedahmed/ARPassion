package com.arpassion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arpassion.springboot.model.Greeting;
import com.arpassion.springboot.model.GreetingRepository;
import com.arpassion.springboot.service.DataLoader;

@SpringBootApplication
public class Springboot2H2Application {
	
	Logger logger = LoggerFactory.getLogger(Springboot2H2Application.class);
	
	@Autowired
	GreetingRepository greetingReposiotry;

	@Autowired
	DataLoader dataLoader;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot2H2Application.class, args);
	}
	
	@PostConstruct
	public void getGreetings(){
		
		for(Greeting greeting : greetingReposiotry.findAll()){
			logger.info(greeting.toString());
		}
	}
	
}
