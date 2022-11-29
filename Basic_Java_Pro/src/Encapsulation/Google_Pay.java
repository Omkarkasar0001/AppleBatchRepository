package Encapsulation;

import java.util.Scanner;


public class Google_Pay {
	// TODO Auto-generated method stub
	void withraw(int amount,Account acc) {  //Passing object Parameter
		float accbal=acc.getBAL();          //50000
		if(accbal>amount)                   // 50000>10000
		{
			accbal=accbal-amount ;          //accbal=50000-10000
		    acc.setBAL(accbal);	         	//store remianing balance 40000
		}
	}
	
	void deposit(int amount,Account acc) {
		float accbal=acc.getBAL();
		accbal=accbal+amount;
		acc.setBAL(accbal);
		
	}
	public static void main(String[] args) {
		Account a1=new Account();
		a1.setID(100);
		a1.setNUM(8999);
		a1.setBAL(50000);                                          //Balance setting
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to  be Withdraw ");   //Enter Amount to be Withraw
		int amt=sc.nextInt();
		
		Google_Pay gp=new Google_Pay();                           //Object Creation for Google_Pay
		gp.withraw(amt, a1);                                      //
		System.out.println(" Amount Withdrawn,Total Balance is  :"+a1.getBAL());
		
		System.out.println("Enter the amount to be deposited ");
		int dep=sc.nextInt();
		
		
		Google_Pay gp1=new Google_Pay();                          //Object Creation for Google_Pay
		gp1.deposit(dep, a1);                                    //dep reff is stored in ammount and a1 is stored in Account acc
		System.out.println(" Amount deposited,Total Balance is  :"+a1.getBAL());

}

}
