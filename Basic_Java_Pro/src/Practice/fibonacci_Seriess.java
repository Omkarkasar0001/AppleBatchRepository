package Practice;

public class fibonacci_Seriess {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("Fibonacci Series: "); int num = 10, a = 0, b = 1, c; for
	 * (int i = 1; i <= num; i++) { System.out.print(a + " "); c = a + b; a = b; b =
	 * c;
	 * 
	 * } } }
	 */


public static void main(String[] args) {
int n1=0,n2=1,n3,i,num=10;       //n1=0,n2=1,n3,num=10,i;
for(i=1;i<=num;i++)              //(i=1;1<10;i++)...(i=9;9<10;i++) (i=10;False;--)
{
	n3=n1+n2;                    //n3=0+1=1
	n1=n2;						//n1=1
	n2=n3;						//n2=n3  i.e 1=1
	System.out.print(n1+" ");        
}
}
}




