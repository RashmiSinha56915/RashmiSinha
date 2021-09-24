package Day4;

import java.util.Scanner;

class emp{ 

public class Day4_2 { 
	private int id;
	private int salary;
	private String name;
	Scanner sc=new Scanner (System.in);
	 void accept() {
		 System.out.println(" enter id :");
		 setId(sc.nextInt());
		 System.out.println(" enter salary :");
		 setSalary(sc.nextInt());
		 System.out.println(" enter salary :");
		 setSalary(sc.nextInt());
		 
		 

	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
void disp() {

	String id = null;
	System.out.println("id :"+id);
	String salary = null;
	System.out.println("salary :"+salary);
	String name = null;
	System.out.println("salary :"+name);
	
	
}
	public static void main(String[] args) 
	
	{
		emp e1= new emp();
		System.out.println("info  :"+e1);
		 e1.accept();
		e1.disp();
		 
		
		
		
	}
	private void accept() {
		// TODO Auto-generated method stub
		
	}

}
