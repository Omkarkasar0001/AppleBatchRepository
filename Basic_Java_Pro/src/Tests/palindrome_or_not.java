package Tests;

public class palindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=3773; int r;int temp; int sum=0;
		temp=num;
	
		while(num>0) {		
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp == sum) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");

}
}
