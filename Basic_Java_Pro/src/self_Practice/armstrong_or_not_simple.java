package self_Practice;

public class armstrong_or_not_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number =153 , originalNumber, remainder, result = 0;

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    
	}

}
