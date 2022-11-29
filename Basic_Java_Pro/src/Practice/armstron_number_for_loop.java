package Practice;

public class armstron_number_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=153,cnt=0,sum=0,temp;
    temp=num;
    while(temp>=0)     // temp=153        //temp=15           //temp=1           //temp=0
    {
    	cnt++;         //cnt=1            //cnt=2             //cnt=3            //cnt=0
    	temp=temp/10;   //temp=153/10=15  //temp=15/10=1      //temp=1/10=0      //temp=0/10=0
    }
    int temp1=num;    //reinitialization
    while(temp1!=0)
    {
    	int power=1;
    	int r=temp1%10;
    	for(int i=1;i<=cnt;i++)
    	{
    		power=power*r;
    	}
    	sum=sum+power;
    	temp1=temp1/10;
    }
    if(sum==num)
    	System.out.println("Armstrong Number");
    else
    	System.out.println("Not Armstrong number");
	}

}
