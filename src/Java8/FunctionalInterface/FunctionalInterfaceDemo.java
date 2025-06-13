package Java8.FunctionalInterface;
//Interfaces that have only one abstract method for eg -> Runnable, Callable, Comparable, Comparator


@FunctionalInterface
interface InterfaceDemo {
    abstract void m1();
    default void m2() {
        System.out.println("This is a default Method");
    }
    static void m3(){
        System.out.println("This is a staic method");
    }
}
class C1 implements InterfaceDemo{
    @Override
    public void m1() {
        System.out.println("This is implementation of Abstract method");
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m1();
        c1.m2();
        InterfaceDemo.m3();
    }
}

