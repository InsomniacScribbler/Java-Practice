package DSA.QuestionRandoms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twiceOccuuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        int count =0;
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entries : map.entrySet()){
            if(entries.getValue() == 2) sb.append(entries.getKey());
        }
        System.out.println(sb.toString());
    }
}
