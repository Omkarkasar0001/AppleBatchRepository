package Constructor;

import java.util.Scanner;

public class Panjab {
 int id;
 String Lassi;
 String Allu_Paratha;
  Panjab(int id,String Lassi,String Allu_Paratha){
	 this.id=id;
	 this.Lassi=Lassi;
	 this.Allu_Paratha=Allu_Paratha;
  }
  void display() {
	  System.out.println(id+" "+Lassi+" "+Allu_Paratha);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id,LassiName,AlluParathaName resp....");
		int i=sc.nextInt();
		String l=sc.next();
		String a=sc.next();
		Panjab p1=new Panjab(i, l, a);
		p1.display();

	}
	
	
	//Panjab class
	
	//Panjab Constructor
	//void display
	//----------------------main-------------------
	//SCanner
	//Classname s1=new Classnme(int,String,String);
	//s1.disp();

}
