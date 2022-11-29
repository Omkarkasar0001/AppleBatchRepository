package Overriding;
//B
public class Person {
	String name;
	int age;
	long contact;
	String gender;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	void display() {
		System.out.println(name+" "+age+" "+gender+" "+contact);
	}
	

}
