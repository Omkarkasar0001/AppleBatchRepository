package Constructor;

public class default_Constructor {   //Default Constructor mean if u dont give values then Compiler make own default constructor
	
	int id;
    String name;
    String dept;
    
    void display() {
    	System.out.println(id+" "+name+" "+dept);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		default_Constructor ref_var=new default_Constructor();
		ref_var.display();
		

	}

}
