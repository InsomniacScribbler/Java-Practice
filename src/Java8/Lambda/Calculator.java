package Java8.Lambda;
interface Calci{
    //void switchOn();
    int sum(int a, int b);
}
public class Calculator {
    public static void main(String[] args) {
//        Calci calci = () -> System.out.println("Calci Switched on"); //lamda expression to overide to switchon
//
//        calci.switchOn();
        int a =10, b= 20;
        Calci calci = (x,y) -> x+y;
        System.out.println(calci.sum(a,b));
    }
}
