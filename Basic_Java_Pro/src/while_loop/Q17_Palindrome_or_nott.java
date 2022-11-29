package while_loop;

public class Q17_Palindrome_or_nott { // Palindrome mean reverse the number is ame as original 121,343,252 etc

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3773, temp, r, sum = 0;
		temp = num;                            
		while (num > 0) {                //true              //true
			r = num % 10;                //r=3              //r=7
			sum = (sum * 10) + r;       //sum=(0*10)+3      //sum2=(3*10)+7=37
			num = num / 10;             //num=3373/10=377   //num2=377 / 10=37   i.e num=sum or  temp=sum
		}
		if (temp == sum)
			System.out.println("Palindrome");     //satisfied its palindrome
		else
			System.out.println("Not Palindrome");
	}
}

/*
 * int n=144,temp,sum=0,r; temp=n; while(n>0) {
 * 
 * r=n%10; sum=(sum*10)+r; n=n/10; } if(temp==sum)
 * System.out.println("Palindrome"); else System.out.println("Not Palindrome");
 * } }
 */

/*
 * 
 * int n=134,temp,r,sum=0; temp=n; while(n>0) { r=n%10; sum=(sum*10)+r; n=n/10;
 * 
 * } if(temp==sum) System.out.println("Palindrome"); else
 * System.out.println("Not Palindrome"); } }
 */