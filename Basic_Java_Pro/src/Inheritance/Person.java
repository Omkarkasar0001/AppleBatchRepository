package Inheritance;

public class Person {
	String name;
	int age;
	long contact;
	id_proof i;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public id_proof getI() {
		return i;
	}
	public void setI(id_proof i) {
		this.i = i;
	}
	public String toString() {
		return name + " " + age + " " + contact + " " + i;
	}

	

}
