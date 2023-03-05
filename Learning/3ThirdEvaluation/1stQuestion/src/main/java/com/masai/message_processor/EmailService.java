package com.masai.message_processor;

import org.springframework.stereotype.Component;

@Component(value = "es")
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub

	}

}
