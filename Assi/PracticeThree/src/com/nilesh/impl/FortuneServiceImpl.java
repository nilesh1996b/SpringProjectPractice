package com.nilesh.impl;

import com.nilesh.service.FortuneService;

public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky Day";
	}

}
