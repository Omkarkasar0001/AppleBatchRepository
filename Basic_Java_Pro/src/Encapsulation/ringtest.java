package Encapsulation;

public class ringtest{
	
	public static void main(String[]args){
    ring r1=new ring();
    r1.setWt(100);
    r1.setShp("PetalShape");
    System.out.println(r1.getWt()+"\n"+r1.getShp());
	}
}