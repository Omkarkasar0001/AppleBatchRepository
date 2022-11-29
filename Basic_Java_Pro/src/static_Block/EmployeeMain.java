package static_Block;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1=new Employee();
		s1.setid(101);
		s1.setsalary(100000);
		s1.setName("Omkar");
		s1.setDept("Development");
		s1.setContact("888888888");
		System.out.println(s1.getid()+" "+s1.getsalary()+" "+s1.getName()+" "+s1.getDept()+" "+s1.getContact());

	}

}
