package Overriding;

public class PersonDoc_patientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d1=new Doctor();
	    d1.setName("Dr_Parsad");
	    d1.setGender("Male");
	    d1.setAge(35);
	    d1.setContact(987898556l);
	    d1.setLisense_ID(28448);
	    d1.setSpecialization("MBBS_MD");
	    d1.setId(1001);
        
        
	    Patient p1=new Patient();
	    p1.setBedno(23);
	    p1.setName("Akshay_Xyz");
	    p1.setId(101);
	    p1.setAge(29);
	    p1.setGender("Male");
	    p1.setDisease("Chickengunia");
	    p1.setContact(96661646554l);
	    
	    System.out.println("---------Doctor's Details---------");
	    d1.display();
	    System.out.println();
	    System.out.println("---------Patient's Details---------");
	    p1.display();
	}
}
