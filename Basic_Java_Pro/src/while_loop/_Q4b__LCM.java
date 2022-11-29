package while_loop;

public class _Q4b__LCM {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n1 = 20, n2 = 30, lcm;

				// maximum number between n1 and n2 is stored in lcm
				lcm = (n1 > n2) ? n1 : n2;

				// Always true
				while (true) {
					if (lcm % n1 == 0 && lcm % n2 == 0) {
						System.out.printf("The LCM of "+n1+" and "+n2+" is "+lcm);
						break;
					}
					++lcm;
				}
	}


}
