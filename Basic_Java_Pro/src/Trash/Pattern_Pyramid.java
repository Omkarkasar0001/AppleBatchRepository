package Trash;

public class Pattern_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=5;i++) {
    	 for(int j=i;j<=5;j++) {       //int j=i;j<=5;
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<(i*2);k++) {    //k<(i*2)
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println(); 
	}
}
/* ^^^^*
   ^^^***
   ^^***** 
   ^*******/
/* ^*******
   ^^*****
   ^^^***
   ^^^^*
 **/
   