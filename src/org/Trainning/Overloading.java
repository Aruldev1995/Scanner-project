package org.Trainning;

public class Overloading {

	private void compname() {
		System.out.println("compname is greens");

	}
	private void compid(int i) {
	   System.out.println("comp id is "+i);
	  
	}
	private void empname(String s, int i) {
		System.out.println("Emp name is "+s);
		System.out.println("empid is "+i);
	}
	private void empphono(int i ,String s,long l) {
		System.out.println("emp pho no is "+i);
		System.out.println("emp mail id is "+s);
		System.out.println("emp Acc no is "+l);
	}
	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.compname();
		over.compid(1234);
		over.empname("deva", 9876);
		over.empphono(987654,"arulraj471@gmail.com",01234567);
		
		
		
	}
}
