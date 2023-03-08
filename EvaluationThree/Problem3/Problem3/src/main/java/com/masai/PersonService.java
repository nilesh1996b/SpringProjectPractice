package com.masai;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class PersonService {
	
	@Autowired
	private String appName;
	
	@Autowired
	private Map<Person, Gym> theMap;
	
	@Autowired
	private List<Person> theList;
	
	
	public void printMap(){
		System.out.println(theMap);
	}
	
	public void printList(){
		
		theList.sort(Comparator.naturalOrder());
		theList.sort(Comparator.reverseOrder());
		
		theList.forEach(System.out::println);
		
		}
	
	
	public void printAppName(){
		System.out.println(appName);
		}

}
