package DSA.QuestionRandoms;
import  java.util.*;
public class UniqueElementsOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,1,2,4};
        Set<Integer> visited = new HashSet<>();
        int count =0;
        for(int x : arr){
            if(!visited.contains(x)){
                count++;
                visited.add(x);
            }
            else continue;
        }

        System.out.println(count);
        System.out.println(visited.toString());
    }
}
