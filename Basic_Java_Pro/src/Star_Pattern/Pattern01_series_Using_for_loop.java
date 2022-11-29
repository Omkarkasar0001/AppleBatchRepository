package Star_Pattern;

public class Pattern01_series_Using_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1,k=4;
		for (int i = 1; i <= 6; i++) 
		{
			System.out.print(j + " "); //j=1   
			j = j + (i * i);           //j=1+(1*1)=2  j=2+(2*2)=6...j=6+(3*3)=15   15+(16)=31   31+(25)=56
		}
		System.out.println();
		int l=1;
		for(int i=1;i<=6;i++)       //6 digit output
		{
			System.out.print(l+" ");  //1 space  i.e l=1
			l=(k*i)+l;              // 5  13 25  41  61
			
		}
	}

}
//1 2 6