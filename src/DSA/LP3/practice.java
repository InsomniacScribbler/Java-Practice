package DSA.LP3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class practice {

    static class item{
        int weight;
        int value;
        public item(int weight, int value){
            this.weight = weight;
            this.value = value;
        }
    }

    static double getMaxValue(item[] items, int capacity){

        Arrays.sort(items,(a,b)-> Double.compare((double)b.weight,(double)a.weight));
        int maxValue = 0;
        for(item i : items){
            if(capacity == 0) break;

            if(i.weight <= capacity){
                maxValue += i.value;
                capacity -= i.weight;
            }
            else{
                double fraction = (double)capacity/(double)i.weight;
                maxValue += fraction* i.value;
                capacity -= fraction*i.weight;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

    }
}
