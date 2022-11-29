package methods;

import java.util.Scanner;

public class BonusPfFCalculator {
	float bonus(int Salary,char ch)                          //
	{
		float newSal;
		System.out.println("Original Salary"+Salary);
		if(ch=='A')
			newSal=Salary+(Salary*0.15f);
		else if(ch=='B')
			newSal=Salary+(Salary*0.10f);
		else if(ch=='C')
			newSal=Salary+(Salary*0.5f);
		else 
			newSal=Salary;
		System.out.println("Salry after Bonus: "+newSal);
		return newSal;
		
	}
	
	void pfCalculator(float Salary) 
	{
		float pf=Salary*0.15f;
		System.out.println("pf iss:"+pf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Employee Salary,Rating(A/B/C/D) of Emplyee: ");
      char r=sc.next().charAt(0);   //Input for Rating
      System.out.println("Enter your Salary: ");
      int sal=sc.nextInt();       //Input of Salary
      
      
      BonusPfFCalculator s1=new BonusPfFCalculator();
      float newSal=s1.bonus(sal,r);    //datatype variable=s1.methodname(dta);
      s1.pfCalculator(newSal);
	}

}
