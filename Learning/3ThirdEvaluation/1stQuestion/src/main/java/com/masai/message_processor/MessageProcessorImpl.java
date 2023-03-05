package com.masai.message_processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "msgpro")
@Scope("singleton")
public class MessageProcessorImpl implements MessageProcessor {
	
	@Autowired(required = false)
	MessageService messageService;
	
	public MessageService getMessageService() {
		return messageService;
	}

	@Override
	public void processMessage(String message) {
		messageService.sendMessage(message);		
	}

}
