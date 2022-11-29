package methods;

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Student s=new Student();
	  Student s2=new Student();
	  
	  System.out.println(s.hashCode());
	  System.out.println(s2.hashCode());
	  
	  System.out.println(s);
	  System.out.println(s2);
	  
	  Student s3=s;   // S3 have Heap location same as s
	  System.out.println(s3);

	}

}
