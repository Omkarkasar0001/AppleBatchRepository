package Trash;

public class primrornot {

	public static void main(String[] args) {

		int num = 7;
		int count = 0;
		for (int i = 1; i <= num; i++) { //1  2 3 4 5 6 7
			if (num % i == 0) {          //7/1=0   7/2=1 X
				count++;                 //count=1  count=2
			}
		}
		if (count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not prime");
	}
}