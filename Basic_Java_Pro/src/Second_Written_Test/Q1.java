package Second_Written_Test;
import java.util.Scanner;

public class Q1{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,product=1,k;
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(;n>0;n=n/10)
		{
			k=n%10;           //132%10=2
			product=product*k;   
		}
		System.out.println(" "+product);   //
		sc.close();
	}
     
}
