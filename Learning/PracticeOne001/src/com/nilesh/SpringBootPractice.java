package com.nilesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootPractice {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext conn = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach co =  conn.getBean("baseBall",Coach.class);
		
		System.out.println(co.getCoach());
		System.out.println(co.getFortune());
		
		conn.close();
				

	}

}
