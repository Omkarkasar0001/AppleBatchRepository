package Inheritance;
//Person 
public class AddressCon {
	private int pincode;
	private String area, city, state;
	
	/*
	 * AddressCon(){ pincode=400001; area="Vidhyut Colony"; city="Manmad";
	 * state="Maharashtra"; }
	 */
	
	AddressCon(int pincode,String area,String city,String state){
		this.pincode=pincode;
		this.area=area;
		this.city=city;
		this.state=state;
		
	}
	public String toString() {
		return pincode+" "+area+" "+city+" "+state;
	}
}
