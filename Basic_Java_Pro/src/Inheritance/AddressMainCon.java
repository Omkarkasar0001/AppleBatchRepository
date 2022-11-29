package Inheritance;
//Person
public class AddressMainCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressCon a1 = new AddressCon(400001, "Malad", "Mumbai", "Maharashtra");  //Address same for all persons below
		Person p1 = new Person(101, 8988555566l, "Ravi  ", "Phule Chowk          ", "Ravi4@gmail.com", a1);
		Person p2 = new Person(102, 9985515669l, "Anil  ", "Elephanta_Cave_road  ", "Abhijit46@gmail.com", a1);
		Person p3 = new Person(103, 9888558567l, "Omkar ", "Sangameshwar         ", "Omkarkasar0001@gmail.com", a1);
	       // System.out.println(a1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
