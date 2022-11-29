package Inheritance;

//College1 Using Constructor
public class Library1 {
	private int notebook;
	String incharge;

	Library1(int notebook, String incharge) {
		this.notebook = notebook;
		this.incharge = incharge;
	}

	public String toString() {
		return notebook + " " + incharge;
	}
}
