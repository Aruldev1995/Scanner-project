package org.Trainning;
    // child class 
public class Greens extends Qspiders {
	 // overriding
	
   @Override
public void courses() {
	System.out.println("Courses for java and selenium ");
	super.courses();
}
 @Override
	public void fees() {
		System.out.println("Fees is 20000");
		super.fees();
	}
 public static void main(String[] args) {
	Greens Gr = new Greens();
	Gr.courses();
	Gr.fees();
}
	
	}
	
	
