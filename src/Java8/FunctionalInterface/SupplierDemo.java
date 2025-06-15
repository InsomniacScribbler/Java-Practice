package Java8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Just got supplied";
        System.out.println(supplier.get());
    }
}
