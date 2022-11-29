package while_loop;

public class Q11_Prime_number_400_to_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=400;i>=300;i--)        //400        399 ... 397
		{
			int mid=i/2,j;               //mid=i/2           mid=i/2
			
			for(j=2;j<=mid;j++)         //j=2......j=198
			{
				if(i%j==0)
				{
					break;             //=0 True (break )         //94(loop Jump) 
				}
			}
			if(j>mid)
			{
				System.out.println(i); //397..389.........
			}
		}
	}

}
