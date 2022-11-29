package Trash;

public class Fib_SeriesUpto_n_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,num=10;
		for(int i=1;i<=num;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
