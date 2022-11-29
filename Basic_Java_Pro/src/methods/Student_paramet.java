package methods;

public class Student_paramet {
	int id;
    String name;
    int m1,m2,m3;
    int per;
    
    void acceptDetails(int sid,String sname,int p1,int p2,int p3) {
    	id =sid;
    	name=sname;
    	m1=p1;
    	m2=p2;
    	m3=p3;
    }
    void calculate() {
    	per=(m1+m2+m3)/3;
    }
    void showResult() {
    System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3+" Result "+per );	
    }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_paramet any=new Student_paramet();
		any.acceptDetails(12,"Omkar",84,82,78);
		any.calculate();
		any.showResult();
            
	}

}
