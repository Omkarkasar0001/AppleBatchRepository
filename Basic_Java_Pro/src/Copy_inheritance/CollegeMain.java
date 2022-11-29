package Copy_inheritance;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d1=new Department();
		d1.setId(105);
		d1.setName("civil");
		
		Library l1=new Library();
		l1.setNotebooks(1050);
		l1.setIncharge("mrs.sanap");
		
		College c1=new College();
		c1.setCode(42009);
		c1.setName("KKWAGH coe");
		c1.setAdress("Amrutdham");
		c1.setDept(d1);
		c1.setLb(l1);
		
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(l1);
	}

}