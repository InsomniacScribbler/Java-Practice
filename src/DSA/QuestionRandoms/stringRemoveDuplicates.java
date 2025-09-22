package DSA.QuestionRandoms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class stringRemoveDuplicates {
    public static String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            char lower = Character.toLowerCase(c);
            if(!seen.contains(lower)){
                seen.add(lower);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }
}
