package classesandobjects;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello everyone welcome to Spring-1 class");

        // creating object
        Student student1 = new Student();
        System.out.println("student1 before assigning values : "+student1);

        //assigning values
        student1.id =123;
        student1.name = "Ajay";
        student1.email="ajay@gmail.com";
        student1.grade="10th grade";
        student1.dob="12/12/2011";

        System.out.println("student1 after assigning values : "+student1);

        // it will create object and assign values in parameterized constructor
        Student student2 = new Student(234,"Vijay","12/12/2010","vijay@gmail.com","10th grade");
        System.out.println("student2 values : "+student2);

        // static examples
        Demo demo1 = new Demo();
        System.out.println("abc is : "+demo1.abc);
        System.out.println("xyz is : "+Demo.xyz);
        demo1.demo1();
        Demo.demo2();

        //final variables
        final int aaa=200;
        int bbb=400;
        System.out.println("aaa is : "+aaa);
        System.out.println("bbb is : "+bbb);

        //aaa=700; cannot change its value since it is final
        bbb=900;

    }
}
