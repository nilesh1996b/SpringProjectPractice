package com.masai.message_processor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cmt = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageProcessor message = cmt.getBean("msgpro",MessageProcessorImpl.class);
		
		message.processMessage(null);
		
	}

}
