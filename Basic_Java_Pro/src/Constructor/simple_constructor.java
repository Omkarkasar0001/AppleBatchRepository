package Constructor;

public class simple_constructor {

	int id;
	String name;
	String dept;

	simple_constructor() {   //Simple Constructoe mean simply it values defined like int id=101; like thso
		id = 101;
		name = "Omkar";
		dept = "IT";

	}

	void display() {
		System.out.println(id + " " + name + " " + dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		simple_constructor ref_var = new simple_constructor();
		ref_var.display();
	}
}
