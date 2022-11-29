package Practice;

public class Addition_Of_Digit_Numbers_level_Up {

	public static void main(String[] args) {
		
		int num=345768;    //Calculator madhe 345768%10 kar anni ek ek digit delete kar 34576%10=6  3457%10=7
		int min=num%10;    //8  (right to left so last digit of 345678 is 8
		int max=num%10;    //345768/10=8
		while(num!=0)      //num=345768  	  num=34576          num=3457     num=345   num=34      num=3
		{
			int r=num%10;  //r=8      			//r=6    		    r=7         r=5          4          3
			if(r<min)               			 //r<min  		    r<min       r<min      r<min		r<min 
			{
				min=r;              			 //min=6   			 min=7	     min=5      min=4    	min=3
			}
			if(r>max)
			{
				max=r;
			}
			num=num/10;  //num=34576  			 //num=3457 	   num=345      num=34     num=3    	 num=0
		}
		
           System.out.println("Max digit is "+max);
           System.out.println("Min digit is "+min);
	}

}
