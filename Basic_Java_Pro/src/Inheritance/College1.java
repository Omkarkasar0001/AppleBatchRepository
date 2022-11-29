package Inheritance;
//College1 Using Constructor
public class College1 {
	private int code;
	String name, adress;
	
	Library lib;
	Department dept;
	
	College1(int code,String name,String adress,Library lib,Department dept){
		this.code=code;
		this.name=name;
		this.adress=adress;
		this.lib=lib;
		this.dept=dept;
	}
	public String toString() {
		return code + " " + name + " " + adress + " " + lib + " " + dept;
	}

}
