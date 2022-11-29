package inhritance.parentchild;

//E
public class Faculty extends Person {
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	double salary;

	void pfCalculator(float Salary) {
		float pf = Salary * 0.15f;
		System.out.println("pf iss:" + pf);
	}

}
