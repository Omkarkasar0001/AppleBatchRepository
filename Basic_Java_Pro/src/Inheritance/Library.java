package Inheritance;
//College
public class Library {
	int notebook;
	String incharge;

	public int getNotebook() {
		return notebook;
	}

	public void setNotebook(int notebook) {
		this.notebook = notebook;
	}

	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String toString() {
		return notebook + " " + incharge;
	}
}
