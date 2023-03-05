package com.masai.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.dao.PersonService;

public class Demo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PersonService ob = cpxa.getBean("personService",PersonService.class);
		
		ob.printPersonList();
		
		System.out.println("\n");
		
		ob.printSkillMap();
		
		cpxa.close();
	}

}
