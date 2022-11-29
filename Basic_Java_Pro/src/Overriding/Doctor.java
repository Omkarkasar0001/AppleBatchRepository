package Overriding;
//B
public class Doctor extends Person {
	int id,lisense_ID;
	String specialization;
	
	public void setId(int id) {
		this.id = id;
	}



	public void setLisense_ID(int lisense_ID) {
		this.lisense_ID = lisense_ID;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}



	void display() {
		super.display();
		System.out.println(id+" "+lisense_ID+" "+specialization);
	}

}
