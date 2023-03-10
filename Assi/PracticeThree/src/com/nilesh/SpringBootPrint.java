package com.nilesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nilesh.service.Coach;

public class SpringBootPrint {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext conn = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach co =  conn.getBean("myCoach", com.nilesh.service.Coach.class);
		
		System.out.println(co.getCoach());
		System.out.println(co.getYourFortune());
		
		conn.close();
		
	}

}
