package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySerach {
    static boolean binarySearch(List<Integer> list, int key){
        int low = 0;
        int high = list.size()-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(list.get(mid).compareTo(key)==0){
                return true;
            }
            else if(list.get(mid).compareTo(key)>0){
                low = mid+1;
            }
            else if(list.get(mid).compareTo(key)<0){
                high = mid-1;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(binarySearch(list,4));

    }
}
