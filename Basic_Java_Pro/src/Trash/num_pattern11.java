package Trash;

public class num_pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
    for(int i=1;i<=5;i++)
    {
    	for(int j=5;j>=i;j--) {
    		System.out.print("");
    	}
    	for(int k=1;k<=i;k++) {
    		System.out.print(n);
    		n++;
    	}
    	System.out.print("\n");
    }
	}
	/*
	 * 1 
	 * 23 
	 * 456 
	 * 78910 
	 * 1112131415
	 */

}
