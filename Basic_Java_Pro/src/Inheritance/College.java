package Inheritance;
//College
public class College { // CollegeMain--->College-->1)Department-->2)Library
	/*
	 * int code; String name,adress; //now subclasses Library lib; Department dept;
	 */
	int code;
	String name, adress;
	
	Library lib;
	Department dept;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Library getLib() {
		return lib;
	}

	public void setLib(Library lib) {
		this.lib = lib;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return  code+" "+name+" "+adress;
	}

}
