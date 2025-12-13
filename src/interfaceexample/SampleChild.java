package interfaceexample;

public class SampleChild implements SampleInterface, SampleInterface2{

    @Override
    public void sample1() {
        System.out.println("sample1 implementation in child class");
        System.out.println("abc is : "+SampleInterface.abc);
    }

    @Override
    public void sample2() {
        System.out.println("sample2 implementation in child class");
        System.out.println("mno is : "+SampleInterface.mno);
    }

    @Override
    public void sample3() {
        System.out.println("sample3 implementation in child class");
        System.out.println("pqr is : "+SampleInterface.pqr);
        System.out.println("xyz is : "+SampleInterface.xyz);
    }

    @Override
    public void sample6() {
        System.out.println("sample6 implementation in child class");
    }

    @Override
    public void sample5() {
        System.out.println("sample5 implementation in child class");
    }
}
