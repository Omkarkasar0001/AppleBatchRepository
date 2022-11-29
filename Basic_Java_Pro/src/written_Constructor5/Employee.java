package written_Constructor5;

import java.util.Scanner;

public class Employee {
	private int emp_id;
	private String name;
	private double sal;
	
	public void setID (int emp_id) {
		this.emp_id=emp_id;
		
	}
	
	public int getID() {
		return emp_id;
	}
	
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setSAL(double sal) {
		this.sal=sal;
	}
	
	public double getSAL() {
		return sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Employee s1=new Employee(); s1.getID(); s1.getName(); s1.getSAL();
		 */

	}

}
