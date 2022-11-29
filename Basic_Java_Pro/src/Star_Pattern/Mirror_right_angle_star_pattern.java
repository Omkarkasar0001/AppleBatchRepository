package Star_Pattern;

public class Mirror_right_angle_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) // i=1 i=2 i=3 i=4 i=5
		{
			for (int j = 5; j >= i; j--) // j1 j2 j3 j4 j5 j1 j2 j3 j4 j1 j2 j3 j1 j2 j1
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//    i=1  * * * * *   j1 j2 j3 j4 j5
//    i=2  * * * *     j1 j2 j3 j4
//    i=3  * * *       j1 j2 j3
//    i=4  * *         j1 j2
//    i=5  *           j1 
//    i=6 Loop break
