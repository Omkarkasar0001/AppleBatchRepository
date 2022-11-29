package Trash;

public class num_pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=4-i+1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	
	}

}
