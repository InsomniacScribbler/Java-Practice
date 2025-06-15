package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Nikhil" , 93);
        marks.put("Sujit" , 99);

        for(Map.Entry<String, Integer> entry: marks.entrySet()){
//            System.out.println(entry.getKey());
            System.out.println(entry);
        }
//        System.out.println(marks.get("rohit")>10);    -----> this gives null pointer exception hence we USE OPTIONAL
        Optional<Integer> mark = Optional.ofNullable(marks.get("rohit"));
        if(mark.isPresent()){
            System.out.println("give output");

        }
        else System.out.println("Null Pointer Exception");

    }
}
