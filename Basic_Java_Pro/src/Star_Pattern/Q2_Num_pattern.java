package Star_Pattern;

public class Q2_Num_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
    		for(j=1;j<=i;j++)
    		{
        			System.out.print(j);
    		}

    		System.out.println("");
		}
		n=4;
		for(i=1;i<=n;i++)
		{
    		for(j=1;j<=n-i+1;j++)
    		{
        			System.out.print(j);
    		}

    		System.out.println("");
		}
	}

}
