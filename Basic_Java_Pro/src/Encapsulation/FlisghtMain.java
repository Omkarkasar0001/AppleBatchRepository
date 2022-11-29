package Encapsulation;

public class FlisghtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight s1=new Flight();
        s1.setId(101);
        s1.setCom("AirIndia");
        s1.setSource("Manmad");
        s1.setDest("Pune");
        System.out.println(s1.getId()+" "+s1.getCom()+" "+s1.getSource()+" "+s1.getDest());
	}

}
