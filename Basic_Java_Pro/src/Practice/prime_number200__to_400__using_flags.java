package Practice;

public class prime_number200__to_400__using_flags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  n1 = 400,n2 = 200;

	        while (n2 < n1) {
	            boolean flag = false;

	            for(int i = 2; i <= n2/2; ++i) {
	                // condition for nonprime number
	                if(n2 % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag && n2 != 0 && n2 != 1)
	                System.out.print(n2 + " ");

	            ++n2;
	        }
	    }
	}