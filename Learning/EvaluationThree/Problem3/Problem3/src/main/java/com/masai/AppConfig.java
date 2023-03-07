package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
public class AppConfig {
	
	@Bean
	public String appName() {
		return "GymApplication";
	};
	

	
	@Bean
	public Map<Person, Gym> theMap(){
		
		Map<Person, Gym> obj = new HashMap<>();
		
		obj.put(new Person(1,"N1","E1",10,"12345"), new Gym(1,"G1",500));
		obj.put(new Person(2,"N2","E2",11,"12345"), new Gym(2,"G2",700));
		obj.put(new Person(3,"N2","E2",12,"12345"), new Gym(2,"G2",600));
		
		return obj;
	}
	
	@Bean("list")
	public List<Person> theList(){
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person(1,"N1","E1",1,"12345"));
		list.add(new Person(2,"N2","E2",2,"12345"));
		list.add(new Person(3,"N3","E3",3,"12345"));
		list.add(new Person(4,"N4","E4",4,"12345"));
		list.add(new Person(5,"N5","E5",5,"12345"));

		
		return list;
	}
	

}
