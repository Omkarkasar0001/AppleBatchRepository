package all_over_practice;
//overlaoding ambiguity
public class apple4{
	
static int apple(int a,int b){
	return a+b;
}

static double apple(int a,int b){
	return a+b;
}
public static void main(String []args){
System.out.println(apple4.apple(10,20));
//ambiguity
}
}