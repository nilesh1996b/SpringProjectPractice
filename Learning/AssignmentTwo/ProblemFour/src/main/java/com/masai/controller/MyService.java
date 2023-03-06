package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyService {
	
	@GetMapping("/service/{name}")
	public void sayHello(@PathVariable("name")String name){
		System.out.print("Welcome " + name);
		}

}
