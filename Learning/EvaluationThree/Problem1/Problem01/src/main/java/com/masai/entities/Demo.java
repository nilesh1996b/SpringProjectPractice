package com.masai.entities;



import java.util.List;

import javax.persistence.EntityManager;


import com.masai.utility.EMUtil;

public class Demo {
	
//	/*
//	 
//	 Many to Many
//	 
//	 */
	
//	Create ****************************************************************************************************
	
	public static void main(String[] args) {

//		/*
//		 
//		 Many to Many (bidirectional):-
//		 
//		 */
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Gym dept1 = new Gym();
		dept1.setDname("Sales");
		dept1.setLocation("Kolkata");
		
		Gym dept2 = new Gym();
		dept2.setDname("Marketing");
		dept2.setLocation("Delhi");
		
		Person emp1 = new Person();
		
		emp1.setName("ram");
		emp1.setSalary(7800);

		
		Person emp2 = new Person();
		
		emp2.setName("dinesh");
		emp2.setSalary(8800);

		
		//here both emp got the dept details
		
		//now we need to give both emp details to the dept
		//associating both emp with the dept
		

		emp1.getDepts().add(dept1);
		emp2.getDepts().add(dept1);
		
		//associating dept(sales) with both emp1 and emp2
		
		dept1.getEmps().add(emp1);
		dept1.getEmps().add(emp2);
		
		
//		Assume dinesh is working in 2 dept(sales and marketing)
		
		emp2.getDepts().add(dept2);
		dept2.getEmps().add(emp2);
		
		
		em.getTransaction().begin();
		
		em.persist(dept1);
		em.persist(dept2);
		
		
		em.getTransaction().commit();
		
		
//		Get the Employee details *****************************************************************************
		
	
//		EntityManager em = EMUtil.provideEntityManager();
//		
//		List<Employee> empList = em.find(Department.class, 1).getEmps();
//		
////		List<Employee> emp =  dept.getEmps();
//		
//		
//		empList.forEach(e->{
//			System.out.println(e.getEmpId());
//			System.out.println(e.getName());
//			System.out.println(e.getSalary());
//
//			System.out.println("============================");
//		});
//		 
//		
//		
//		System.out.println("done...");
		
//		Get the Employee details *****************************************************************************
		
//		EntityManager em2 = EMUtil.provideEntityManager();
//		
//		List<Department> empList2 = em2.find(Employee.class, 2).getDepts();
		
//		List<Employee> emp =  dept.getEmps();
		
		
//		empList2.forEach(e->{
//			System.out.println(e.getDeptId());
//			System.out.println(e.getDname());
//			System.out.println(e.getLocation());
//
//			System.out.println("============================");
//		});
//		 
//		
//		
//		System.out.println("done...");
		
	} 

}
