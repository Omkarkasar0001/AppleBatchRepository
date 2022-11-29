package Polymorphism_Written5;

public class Q4
{
    double series(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {   //i=1              //i=2             //i=3              //i=4              //i=5
            double term = 1.0 / i;       //term=1.0/1=1.0   //temp=1.0/2=0.5  //temp0.5/2=0.25   //0.25/2=0.125     //0.125/2=0.0625
            sum += term;                 //sum=0+1.0=1.0    //sum=1.0+0.5=1.5 //1.5+0.25=1.75    //1.75+0.125=1.875 //1.875+0.0625=1.8875
        }
        return sum;
    }
    
    double series(double a, double n) {
        double sum = 0;
        int x = 1;
        for (int i = 1; i <= n; i++) {         //i=1
            int e = x + 1;                     //e1=1+1=2
            double term = x / Math.pow(a, e);  //
            sum += term;
            x += 3;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        Q4 obj = new Q4();
        System.out.println("First series sum = " + obj.series(5));
        System.out.println("Second series sum = " + obj.series(3, 8));
    }
}
