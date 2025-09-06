package DSA.Arrays;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    static void linearSearch(List<Integer> list, int key){
        for(int i=0;i<list.size();i++){
            if(key==list.get(i)){
                System.out.println("Just found at index "+i);
            }

        }
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,55,6,7);
        list.stream().forEachOrdered(t -> System.out.println("Just consumed "+t));
        System.out.println(Arrays.toString(list.toArray()));
        linearSearch(list,2);

    }
}
