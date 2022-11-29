package Tests;

public class While__Loop_Addition_Of_Digit_Sum_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=345, sum=0,product=1;
		while(num!=0)      // num=345,Condition True                 num=34           num=3           num=0
		{
			int r=num%10;     // r=345/10=34.5 remainder is 5        r34%
			sum=sum+r;        //sum =0+5=5
			product=product*r;  //product=1*5=5
			num=num/10;        //num=345/10=34 (int)
			
		}
          System.out.println("Addition is  "+product);
          System.out.println("Product is  "+sum);
	}

}