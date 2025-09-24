package DSA.QuestionRandoms;
import  java.util.*;
public class sumOfEvenTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,2,4,6};
        Set<Integer> visited = new HashSet<>();
        int sum =0;
        for(int x : arr){
            if(!visited.contains(x) && x%2==0){
                sum+=x;
                visited.add(x);
            }
            else continue;
        }

        System.out.println(sum);
        System.out.println(visited.toString());
    }
}
