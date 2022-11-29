package Assignment1;

import java.util.Scanner;

public class Convert_Cm_to_Meter_To_Km {

	public static void main(String[] args) {
		
				double i,Cm=1,Meter,Km;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter A Meter Value");
		        i=sc.nextDouble();
		        
		        Meter=1000*Cm;
		        System.out.println("A Meter has "+Meter+"Cms");
		        Km=1000*Meter;
		        System.out.println("A Km has "+Km +"Cms");
		        
		        
		        
		        

	}

}
