package DSA.QuestionRandoms;

import java.util.Scanner;

public class minCostToVowel {

    public static int minCost(String s){
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        int totalCost =0;

        for(char c : s.toCharArray()){
            int mincost = Integer.MAX_VALUE;

            boolean isVowel = false;
            for(char vowel : vowels){
                if(c == vowel){
                    isVowel = true;
                    break;
                }
            }
            if(isVowel) continue;

            for(char vowel : vowels){
                mincost = Math.min(mincost,Math.abs(vowel-c)) ;
            }
            totalCost += mincost;
        }
        return totalCost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minCost(s));
    }
}
