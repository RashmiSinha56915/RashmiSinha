//DAY4 PROGRAMS

//class name
// dtata member,member functions
package Day4;

import java.util.Scanner;

class student{
	private String name;// data member
	private int roll;
	Scanner s=new Scanner(System.in);
	{
	System.out.println("enter name :" );
	name=s.next();
	System.out.println("enter roll :");
	roll=s.nextInt();
	
	}
	public void dis() // member function
	System.out.println("enter name");
	

class Day4_1 {

	public void main(String[] args) {
		student s1= new student();
		System.out.println("student1= "+s1);
		
		
		
		s1.dis();
	}
		
		//create object
		//used to access the members of class
		student s1=new student();
		
		

	}

}
