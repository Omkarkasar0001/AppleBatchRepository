package Polymorphism_Written5;

//Q2
public class Person {
	String name, gender;
	int age;
	Addr b;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Addr getB() {
		return b;
	}

	public void setB(Addr b) {
		this.b = b;
	}

	public String toString() {
		return name + " " + gender + " " + age + " " + b;
	}

}
