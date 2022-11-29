package Inheritance;
//College
public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library l1=new Library();
		l1.setNotebook(10000);
		l1.setIncharge("Mr.M_Patil");
		
		
		Department d1=new Department();
		d1.setId(101);
		d1.setName("Full_Stack_Java_Development");
		
		College c1=new College();
		c1.setCode(53444);
		c1.setName("SNJB");
		c1.setAdress("Neminagar");
		c1.setDept(d1);
		c1.setLib(l1);
		
		System.out.println(l1);
		System.out.println();
		System.out.println(d1);
		System.out.println();
		System.out.println(c1);
		

	}

}
