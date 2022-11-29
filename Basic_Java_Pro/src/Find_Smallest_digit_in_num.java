import java.util.Scanner;

public class Find_Smallest_digit_in_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();        // input 6789	 
		int smallest=num%10;           //Smallest1=6789%10=9
		while(num>0) {                 //true                  //true                //true                //true
			int remainder=num%10;      //remainder1=6789%10=9  //remainder2=678%10=8 //remainder3=67%10=7  //remainder4=6%10=0.6~6
			if(smallest>remainder) {   //jump                  //true                //true                //true
				smallest=remainder;                            //smallest=remianr=8  //smallest=remianr=7  //smallest=remianr=6
			}
			num=num/10;               //num=6789/10=678        //num=678/10=67       //num=67/10=6         //num=6/10=0.6
		}
		System.out.println("Small digit is "+smallest);  //6 last updated value of 6
		sc.close();
}
}
