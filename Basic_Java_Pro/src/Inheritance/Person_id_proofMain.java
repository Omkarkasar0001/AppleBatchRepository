package Inheritance;

public class Person_id_proofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		id_proof d=new id_proof();
		d.setNumber(101);
		d.setName("Omkar");
		d.setAddress("Hudco");
		
		Person p1=new Person();
		p1.setName("Omkar");
		p1.setAge(23);
		p1.setContact(9966552388l);
		p1.setI(d);
		
		 System.out.println(d.getName()+" "+d.getNumber()+" "+d.getAddress()); 
		 System.out.println(p1.getName()+" "+p1.getContact()+" "+p1.getAge());
			/*
			 * System.out.println(p1.getName()+" "+p1.getContact()+" "+p1.getAge()+" "+p1.
			 * getI());
			 */

	}

}
