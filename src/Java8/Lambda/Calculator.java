package Java8.Lambda;
interface Calci{
    void switchOn();
}
public class Calculator {
    public static void main(String[] args) {
        Calci calci = () -> System.out.println("Calci Switched on"); //lamda expression to overide to switchon

        calci.switchOn();
    }
}
