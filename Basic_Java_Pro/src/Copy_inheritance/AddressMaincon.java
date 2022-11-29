package Copy_inheritance;
//Person
public class AddressMaincon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1=new Person();
		AddressCon a1=new AddressCon(410504,"Junnar","Pune","Maharastra");
		Person p1=new Person(101,123456745,"Vishal","Ale", "zxcvbnm@",a1);
		Person p2=new Person(102,12345678,"Vipul","Khodad", "zxcvbnm@",a1);
        Person p3=new Person(103,198765465,"Suyog","Narayangoan", "qwertyui@",a1);
       // System.out.println(a1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        
	}

}