package static_Block;

public class Employee {

	private int id,salary;
	private String name,dept,contact;
	
	//Public getters and setters
	public void setid(int id) { //Dont foegot to defien parameter
		this.id=id;
	}
	
	public int getid()    //No void here 
	{
		return id;
	}
	
	
	public void setsalary(int salary) { 
		this.salary=salary;
	}
	
	public int getsalary()
	{
		return salary;
	}
	
	
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public String getDept() {
	return dept;
	}
	
	
	
	public void setContact(String contact) {
		this.contact=contact;
	}
	public String getContact() {
		return contact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
