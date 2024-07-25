class One{
     private void calculate(double x){
        System.out.println("Square value = "+(x*x));
    }
    void pcalculate(double x){
        calculate(25);
    }
}
class Two extends One {
     void calculate(double x){
        System.out.println("Square root = "+ Math.sqrt(x));
    }
}
public class Poly{
    public static void main(String []args){
        Two t= new Two();
        t.calculate(25);
        One o= new One();
        o.pcalculate(25);
        One t2= new Two();
        t2.pcalculate(25);
    }
}