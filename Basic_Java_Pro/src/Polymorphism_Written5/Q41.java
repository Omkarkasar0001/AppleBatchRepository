package Polymorphism_Written5;

public class Q41 {
	// class beginning
	   double s =0;
	   double series(double n)
	   {
	     int i;
	     for(i = 1;i <=n;i++)
	     {
	       s = s + 1.0/i;     //0+0.1/1=1   //1+1.0/2=1    //1+1.0/3=0.66   //0.66+1/4=0.415   //s=0.415+1/5=0.28   
	     }
	     return(s);  //
	   }
	   double series(double a, double n)
	   {
	     int i, c = 1;
	     for(i=1;i<=n;i++)   //
	     {
	       s=s+c/Math.pow(a,c+1);    //s=0+1/a^2   //4/a^5
	       c=c+3;                    //c=1+3=4     //4+3=7
	     }
	     return(s); // returns the value of S
	   }

}
