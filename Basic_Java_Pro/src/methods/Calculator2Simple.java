package methods;

import java.util.Scanner;

public class Calculator2Simple {
	
	void add(int x,float y)
	{
		System.out.println("Addition is:"+(x+y));
	}
	void multiply(int x,int y)
	{
		System.out.println("Multiplication is : "+(x*y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int x,y;
    System.out.println("Enter Number");
    x=sc.nextInt();
    y=sc.nextInt();
    
    Calculator2Simple c1=new Calculator2Simple();
    c1.add(x, y);
    Calculator2Simple c2=new Calculator2Simple();
	c2.multiply(x,y);
	}

}
