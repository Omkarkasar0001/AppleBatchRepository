package Inheritance;

//College1 Using Constructor
public class Department1 {
	private int id;
	String name;

	Department1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}
}
