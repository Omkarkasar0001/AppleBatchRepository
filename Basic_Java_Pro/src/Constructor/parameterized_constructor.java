package Constructor;

public class parameterized_constructor {

	int id;
	String name;
	String dept;

	parameterized_constructor(int idd,String namee,String deptt) {   //Simple Constructoe mean simply it values defined like int id=101; like thso
		id=idd;
		name=namee;
		dept=deptt;

	}

	void display() {
		System.out.println(id + " " + name + " " + dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parameterized_constructor ref_var = new parameterized_constructor(101,"Omkar","IT");
		ref_var.display();
	}

}
