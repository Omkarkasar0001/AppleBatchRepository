package static_Block;

public class Movie {
  int id;
  String name;
  String producere;
	{
		System.out.println("in instance block 1");
		id=1;
		name="aaaa";
		producere="bbbbb";
	}
	
	{
		System.out.println("in instance block 2");
		id=1;
		name="jjjj";
		producere="mmmmmm";
	}
	Movie()
	{
	System.out.println("In Simple Constructor....");	
	id=00;
	name="Brahmastra";
	producere="Karan Johar";
	
	}
	
	void setData(int id,String name,String producere){
		this.id=id;
		this.name=name;
		this.producere=producere;
		display();
	}
	
	void display(){
		System.out.println(id+" "+name+" "+producere);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie s1=new Movie();
		s1.display();
		
		Movie s2=new Movie();
		s2.display();
		

	}

}
