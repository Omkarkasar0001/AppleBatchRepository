package Inheritance;
//USing Contructor***********************************************************
public class Engine1 {
	String rpm;
	int cylinder;
	int torque;
    String company;
    
    Engine1(String rpm,int cylinder,int torque,String company){
    	this.rpm=rpm;
    	this.cylinder=cylinder;
    	this.torque=torque;
    	this.company=company;
    }
    
    public String toString() 
	{
		return rpm+" "+cylinder+" "+torque+" "+company;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
