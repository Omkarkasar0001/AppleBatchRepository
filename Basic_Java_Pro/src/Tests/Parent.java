package Tests;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c1=new child1();
		c1.setC1age(10);
		c1.setC1_color("Blue");
		
		child2 c2=new child2();
		c2.setCage(20);
		c2.setC_colour("Red");
		
		System.out.println(c1.getC1age()+" "+c1.getC1_color());
		System.out.println(c2.getCage()+" "+c2.getC_colour());

	}

}
