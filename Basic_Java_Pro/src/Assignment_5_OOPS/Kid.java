package Assignment_5_OOPS;

public class Kid {
 void readBook(int a){
  System.out.println(" "+a);
	
	 
 }
void readBook(String Chatrapati,String Narveer_Comander){
	
	System.out.println(" "+Chatrapati);
	
	System.out.println(" "+Narveer_Comander);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Kid s1=new Kid();
     s1.readBook(100);
     Kid s2=new Kid();
     s2.readBook("Chatrapati_Shivaji_Maharaj", "Narveer_Baji_Prabhu_Deshpande");
	}

}
