package Encapsulation;

public class Flight {
	
	private int id;
	private String company,source,destination;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	
	public void setCom(String company) {
		this.company=company;
	}
	public String getCom() {
		return company;
	}
	
	public void setSource(String source) {
		this.source=source;
	}
	public String getSource() {
		return source;
	}
	
	

	public void setDest(String destination) {
		this.destination=destination;
	}
	public String getDest() {
		return destination;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
