package while_loop;
 import java.util.Scanner;
public class Q14 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int base,exponent;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Base Value");
      base=sc.nextInt();
      System.out.println("Enter Exponent Value");
      exponent=sc.nextInt();
      
      long result = 1;
      while(exponent!=0)  //4            3              2            1          False
      {
    	 result*=base;   //result=result*base;
    	                 //1*3=3        3*3=9         9*3=27         27*3=81  Null
    	 
    	 
    	 --exponent;     //Decrement 
    	 
      }
      System.out.println("Answer is:   "+result);    //Print Last Upadated Value
	}

}
