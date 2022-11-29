package written_Constructor5;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1=new Employee();
		s1.setID(101);
		s1.setName("Omkar");
		s1.setSAL(100000);
		System.out.println(s1.getID()+" "+s1.getName()
		+" "+s1.getSAL());
	}

}
