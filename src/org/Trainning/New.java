package org.Trainning;

import java.util.Scanner;

public class New {
		
		  public static void main(String[] args) {
			
			  Scanner sc= new Scanner(System.in);
			  
			  String name =sc.next();
			  System.out.println("Enter the name"+name);
			  
			  int empid = sc.nextInt();
			  System.out.println("enter your emp id");
			  
			  String compname = sc.next();
			  System.out.println("enter your company name");
			  
			  String posting = sc.next();
			  System.out.println("enter your posting");
			  
			  byte experiance = sc.nextByte();
			  System.out.println("enter your experiance");
			  long mobileno = sc.nextLong();
			  System.out.println("enter your mobile no");
			  
			  float salary = sc.nextFloat();
			  System.out.println("enter your salary");
			  
			  double point = sc.nextDouble();
					  System.out.println("enter your point");
					  
		      boolean eligible = sc.hasNextBoolean();
		      System.out.println("enter your eligible status");
		      
		      System.out.println("name"+" "+name+" "+"empid"+" "+empid+" "+"posting"+" "+posting+" "+"experiance"+" "+experiance+" "+"mobileno"+" "+mobileno+" "+"salary"+" "+salary+" "+"point"+" "+point+" "+"eligible"+" "+eligible);
		      
			  
			  
			  
		      
}
}
