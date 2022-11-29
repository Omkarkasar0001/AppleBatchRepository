package Trash;

public class char_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1,p='A';i<=5;i++,p++) {
		    	for( int j=5;j>=i;j--) {
		    		System.out.print((char)p+" ");
		    	}
		    	System.out.println();
		    }
	}

}
//A A A A A 
//B B B B 
//C C C 
//D D 
//E 

