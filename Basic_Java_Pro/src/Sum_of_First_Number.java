
public class Sum_of_First_Number {

	public static void main(String[] args) {
		int i=3,sum = 0;
		while(i>0)   //5 4 3 2 1
		{
			sum +=i; //sum=sum+i=0+5=5  5+4=9 9+3=12 12+2=14  14+1=15 Sum=15 This Is right
			         //sum=sum+i=0+5=5  0+4=4 0+3=3 0+2=2  0+1=1      Sum=15 This Is Wrong Method
			i--;
			
		}
		System.out.println("Sum Of First Ten Numbers are: +"+sum);
	}

}
