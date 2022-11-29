package Inheritance;
//Q4
public class id_proof {
	private int number;
	private String name;
	String address;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return number+ " " + name+ " " + address ;
	}

	
	

}
