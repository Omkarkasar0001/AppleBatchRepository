package methods;

public class sum_of_factor_mtd2 {
	public static void sum_of_factor() {
		// positive number
		int num = 20;
		int sum = 0;
		for (int i = 1; i <= num; i++) {  //1,2,3..20

			// if number is divided by i
			// i is the factor
			if (num % i == 0) {  //1,2,4,5,10,20   //20 la 1 ne divide ,2, 3 nahi hot...

				sum = sum + i;
			}
		}
		System.out.println("Sum is " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum_of_factor();

	}
}