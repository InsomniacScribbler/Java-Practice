package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("one",10);



        System.out.println(map);
        System.out.println(map.entrySet());
        for (Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println(m);
        }


    }
}
