package inhritance.parentchild;

public class D_SonDaughterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D_Daughter s1=new D_Daughter();
		s1.setAge(30);
		s1.setName("Rahul Sharama");
	   
	    
	    s1.setNickname("Aaru");
	    s1.setWeight(15);
	    
	    System.out.println("----------------Son's Details---------------");
	    System.out.println(s1.getName()+" "+s1.getAge());
	    System.out.println("---------- --Daughter's Details-------------");
	    System.out.println(s1.getNickname()+" "+s1.getWeight());
		
	}

}
