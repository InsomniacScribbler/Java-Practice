package Java8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Just consumed "+t);
        consumer.accept(10);
    }

}
