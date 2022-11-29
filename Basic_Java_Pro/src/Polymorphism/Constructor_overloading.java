package Polymorphism;

public class Constructor_overloading {
	int x;
	int y;
	int z;
	
	Constructor_overloading()
	{
		 this(100);
		System.out.println("None");
	}
	
	  Constructor_overloading(int x)
	   {
		  this(100,200);
		   System.out.println("In One parameter");
	   }
			
	  Constructor_overloading(int x,int y)
	   {
		  this(100,200,300);
		   System.out.println("In One parameter");
	   }
			
	  Constructor_overloading(int x,int y,int z)
	   {
		   System.out.println("Threee Parameter");
	   }
	  void display() {
		  System.out.println(x+" "+y+" "+z );
	  }
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_overloading s1=new Constructor_overloading();
		s1.display();
		
		
	}

}
