package com.masai;

public class A {
	
	   private int a = 0;
	   public int getA() {
	      System.out.println("getA() method");
	      return a;
	   }
	   public void setA(int aa) {
	      if(!(aa > 10))
	         a = aa;
	   }

}
