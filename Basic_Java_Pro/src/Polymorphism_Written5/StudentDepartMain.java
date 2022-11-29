package Polymorphism_Written5;

public class StudentDepartMain {
//Q1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department();
		d1.setId(101);
		d1.setName("IT");
		
		Student s1=new Student();
		s1.setRoll_no(1);
		s1.setName("Omkar");
		
		System.out.println(s1.getRoll_no()+" "+s1.getName()+" "+d1.getId()+" "+d1.getName());

	}

}
