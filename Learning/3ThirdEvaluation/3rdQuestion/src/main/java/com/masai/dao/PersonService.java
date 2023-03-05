package com.masai.dao;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.masai.model.Person;
import com.masai.model.Skill;

public class PersonService {
	
	private Map< Person ,Skill> skillMap;
	private List<Person> personList;
	
	
	
	public PersonService() {

	}
	
	

	public void setSkillMap(Map<Person, Skill> skillMap) {
		this.skillMap = skillMap;
	}



	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}



	public void printSkillMap(){
		
		for(Map.Entry<Person, Skill> list : skillMap.entrySet())
		{
			System.out.println(list.getKey());
			System.out.println(list.getValue());
		}
   }

   public void printPersonList(){
	   
		Collections.sort(personList, (a,b)->(a.getAge()>=b.getAge())? 1:-1); 
		personList.forEach(System.out::println);
   }

}


