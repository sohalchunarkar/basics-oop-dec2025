package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        PerformSum performSum = new PerformSum();
        performSum.sum(2,3);
        performSum.sum(4,5,6);
        performSum.sum(2,4.56f);
        performSum.sum(5.67,7.89f);
        performSum.sum(6.78,4.56);
        performSum.sum(6.56f,3.45f);
    }
}
