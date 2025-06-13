package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (t) -> t%2==0;
        System.out.println(predicate.test(28));
        List<Integer> list = Arrays.asList(1,2,55,6,7);
        list.stream().filter(predicate).forEach(t-> System.out.println(t));
    }
}
