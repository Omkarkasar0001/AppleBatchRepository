package while_loop;

public class Q4a_Find_GCD_Of_Given_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=20,n2=30;
       while(n1!=n2) {    //n1 is not equal to n2
    	   if(n1>n2) {    
    		   n1-=n2;   //n1=98-56 n1=42-56=14
    		   
    	   }
    	   else
    		   n2-=n1;    
       }
           System.out.println("GCD is "+n1);
            
       
	}
}