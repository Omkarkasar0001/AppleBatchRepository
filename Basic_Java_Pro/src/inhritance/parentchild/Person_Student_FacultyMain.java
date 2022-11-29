package inhritance.parentchild;

public class Person_Student_FacultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s1=new Student();
 
  
  System.out.println("-------------Faculty Details--------------"); 
  Faculty f1=new Faculty();
  f1.setSubject(" R&D ");
  System.out.println(f1.getSubject()+" ");
  f1.pfCalculator(95000);
  

  
	}

}
