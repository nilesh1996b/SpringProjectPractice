package com.nilesh;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {
	
	private String[] data = {
		"Today is Your Lucky Day",
		"Everything will be ok",
		"Stay Away from Negative People",
		"Don't worry Everything will be fine"
	};
	
	private Random randomData = new Random();

	@Override
	public String getFortune() {
		
		int x = randomData.nextInt(data.length);
		
		return data[x];
	}

}
