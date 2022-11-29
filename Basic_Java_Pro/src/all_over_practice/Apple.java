package all_over_practice;
import java.util.Scanner;
public class Apple{
	int id;
	String name;

	Apple(int id,String name){
     this.id=id;
     this.name=name;
	}

	void display(){
	System.out.println(id+" "+name);
	}


	public static void main(String[]args){//Static
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter ID,Name Resp....");
    int i=sc.nextInt();
    String n=sc.next();
	Apple a1=new Apple(i,n);
	a1.display();

	}
}
