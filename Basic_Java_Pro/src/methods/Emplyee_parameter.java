package methods;

public class Emplyee_parameter {
	int eid, sal;
	String sname, position;
	int m1, m2, m3;
	int per;

	void acceptDetails(int id, int salary, String name, String designation, int p1, int p2, int p3) {
		eid = id;
		sal = salary;
		sname = name;
		position = designation;
		m1 = p1;
		m2 = p2;
		m3 = p3;

	}

	void cal() {
		per = (m1 + m2 + m3) / 3;

	}

	void showResult() {
		System.out.println(
				eid + " " + sal + " " + sname + " " + position + " " + m1 + " " + m2 + " " + m3 + " Result " + per);
	}

	public static void main(String[] args) {
		// Method calling
		Emplyee_parameter any = new Emplyee_parameter();
		any.acceptDetails(1, 50000, "Omkar", "Developer", 90, 80, 84);
		any.cal();
		any.showResult();

	}

}
