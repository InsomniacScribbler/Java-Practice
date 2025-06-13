package Java8.Lambda;

public class LambdaExpDemo {

    public static void m1(){
        System.out.println("This is a normal Method");
    }


    public static void main(String[] args) {
        m1();
        Runnable runnable = () -> System.out.println("This is a Lambda Expression");
        runnable.run();
    }
}
