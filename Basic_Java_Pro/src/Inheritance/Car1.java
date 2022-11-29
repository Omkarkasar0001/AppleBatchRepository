package Inheritance;

public class Car1 {//Using Constructor
	int id,price;
	String name,colour;
	Engine e;
	
	Car1(int id,int price,String name,String colour){
		this.id=id;
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	
	public String toString() 
	{
		return id+" "+name+" "+price+" "+colour+" "+e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
