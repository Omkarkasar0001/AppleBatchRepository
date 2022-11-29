package Copy_inheritance;

public class Library {
	
	private int notebooks;
	private String incharge;
	
	public int getNotebooks() {
		return notebooks;
	}
	public void setNotebooks(int notebooks) {
		this.notebooks = notebooks;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
 public String toString()
 {
	 return notebooks+" "+incharge;
 }
}