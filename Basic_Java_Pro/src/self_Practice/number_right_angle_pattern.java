package self_Practice;

public class number_right_angle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=4;
        System.out.println("number pattern");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        System.out.println("Downward Number");
        for (int i =rows; i >=1; i++) 
        {
         for(int j=1;j<=i;j6+-)
         {
        	 System.out.print(j + " " );
         }
         System.out.println("");
        }

	}

}
