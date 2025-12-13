package polymorphismexample;

public class PerformSum {

    public void sum(int a, int b){
        System.out.println("sum of two int nos is : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three int nos is : "+(a+b+c));
    }

    public void sum(int a, float b){
        System.out.println("sum of one int and one float nos is : "+(a+b));
    }

    public void sum(double a, float b){
        System.out.println("sum of one double and one float nos is : "+(a+b));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float nos is : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double nos is : "+(a+b));
    }
}
