package Polymorphism_Written5;

import java.util.Scanner;

public class comp {
	
	 public void compare(int a, int b) {
	        
	        if (a > b) {
	            System.out.println(a);
	        }
	        else {
	            System.out.println(b);
	        }
	        
	    }
	    
	    public void compare(char a, char b) {
	        int x = (int)a;
	        int y = (int)b;
	        
	        if (x > y) {
	            System.out.println(a);
	        }
	        else {
	            System.out.println(b);
	        }
	        
	    }

}
