package Trash;

import java.util.Scanner;
public class bonuspfcalculator{

    float bonuscalculator(int salary,char ch){
    	float newsal;
    	System.out.println("Original Salary"+salary);
    	if(ch=='A') 
    		newsal=salary+(salary*0.20f);
    	else if(ch=='B')
    		newsal=salary+(salary*0.15f);
    	else if(ch=='C')
    		newsal=salary+(salary*0.10f);
    	else
    		newsal=salary;
		System.out.println("Salary after Bonus: "+newsal);
		return newsal;
    }
    void pfcalculator(float salary,float newsal){
		float pff=salary*0.15f;
		 System.out.println("pf iss:"+pff);
    		float pf=newsal*0.95f;
    		System.out.println("Salary after PF :"+pf);
    	}

	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee rating A/B/C ");
    char ch=sc.next().charAt(0);
    System.out.println("Enter Salary");
    int salary=sc.nextInt();
    
    //System.out.println("Salary after Bonus "+salaryafterbonus);
    // System.out.println("New Salary"+newsal);
    bonuspfcalculator s1=new bonuspfcalculator();
   float newsal=s1.bonuscalculator(salary, ch);       //int returnname=s1.methodname(data);
    s1.pfcalculator(salary,newsal);
	}
}