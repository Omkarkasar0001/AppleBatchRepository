package Inheritance;
//College1 Using Constructor

public class CollegeMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department1 d1=new Department1(101, "Computer Scienece");
        Library1 l1=new Library1(1000,"Mr_patil");
        College1 c1=new College1(5612,"SNJB", "Neminagar",null,null);
        
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(l1);
	}

}
