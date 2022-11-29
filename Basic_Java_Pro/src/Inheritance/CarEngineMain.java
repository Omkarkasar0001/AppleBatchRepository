package Inheritance;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c1=new Car();
      c1.setId(101);
      c1.setName("Aston Martin");
      c1.setPrice(37500000);
      c1.setColour("Matte_Black");
		/* c1.setE(16); */
      
      Car c2=new Car();
      c2.setId(102);
      c2.setName("Cadillac");
      c2.setPrice(1200000);
      c2.setColour("Matte_Black");
		/* c2.setE(16); */
      
      Engine e1=new Engine();
      e1.setCompany("Ford");
      e1.setCylinder(8);
      e1.setRpm("6000");
      e1.setTorque(700);
      
      Engine e2=new Engine();
      e2.setCompany("General Motors");
      e2.setCylinder(4);
      e2.setRpm("4400");
      e2.setTorque(700);
      
      System.out.println("-------------Information of Cars----------------");
      System.out.println("ID :"+c1.getId()+"\nName :"+c1.getName()+"\nPrice: "+c1.getPrice()+"\nColour"+c1.getColour());
      System.out.println("-------------------Engine----------------------- :");
      System.out.println("Company :"+e1.getCompany()+"\nCylinders "+e1.getCylinder()+"\nRPM : "+e1.getRpm()+"\nTorque : "+e1.getTorque());
      System.out.println();
      System.out.println();
      System.out.println("-------------Information of Cars----------------");
      System.out.println("ID :"+c2.getId()+"\nName :"+c2.getName()+"\nPrice: "+c2.getPrice()+"\nColour"+c2.getColour());
      System.out.println("-------------------Engine----------------------- :");
      System.out.println("Company :"+e2.getCompany()+"\nCylinders "+e2.getCylinder()+"\nRPM : "+e2.getRpm()+"\nTorque : "+e2.getTorque());
      

	}

}
