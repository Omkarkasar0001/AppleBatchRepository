package self_Practice;

public class armstrong_number_From_300_to400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 300, high = 400;

	    for(int number = low + 1; number < high; ++number) {
	      int digits = 0;
	      int result = 0;
	      int originalNumber = number;

	      // number of digits calculation
	      while (originalNumber != 0) {
	        originalNumber /= 10;
	        ++digits;
	      }

	      originalNumber = number;
	      // result contains sum of nth power of its digits
	      while (originalNumber != 0) {
	        int remainder = originalNumber % 10;
	        result += Math.pow(remainder, digits);
	        originalNumber /= 10;
	      }

	      if (result == number) {
	        System.out.print(number + " ");
	      }
	    }
	}

}
