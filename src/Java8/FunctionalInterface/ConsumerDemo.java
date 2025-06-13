package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Just consumed "+t);
        consumer.accept(10);

        List<Integer> list = Arrays.asList(1,2,55,6,7);
        list.stream().forEachOrdered(t -> System.out.println("Just consumed "+t));
    }

}
