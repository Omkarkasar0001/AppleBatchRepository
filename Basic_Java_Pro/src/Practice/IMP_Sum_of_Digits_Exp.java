package Practice;

public class IMP_Sum_of_Digits_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2131;  //Input value
		int sum=0;     //innitialization of sum always equal to zero 0
		while(num>0)   //True  num is greater than Zero i.e 2131
		{
			sum=sum+num%10;    //sum1=0+2131%10=1          sum2=sum+num1%10 =0+213%10 =0+3=3    sum3=0+21%10 =0+1=1  sum4=0+2%10=0+2=2
			num=num/10;        //num1=2131/10=213          num2=213/10=21                        num3=2/10=2         num=0
		}
	
		System.out.println("Sum of Digit In Number  " + sum);      //Sum=sum1+sum2+sum3+sum4
	}
}
