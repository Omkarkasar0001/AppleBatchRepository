package Trash;
public class parameterized_constructor{
    int id;
    String name;
    String dept;
   parameterized_constructor(int id,String name,String dept){
   this.id=id;
   this.name=name;
   this.dept=dept;
   } 

   public String toString(){
   return "Enter ID: "+id+"   Enter Your Name : "+name+"  Enter Your Dept  : "+dept;
   }
   
	public static void main(String []args){
    parameterized_constructor s=new parameterized_constructor(101,"Omkar","IT");
    
    System.out.println(s);
	}
}