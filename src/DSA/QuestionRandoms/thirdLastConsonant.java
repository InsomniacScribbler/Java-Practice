package DSA.QuestionRandoms;

import java.util.*;

public class thirdLastConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        // Find all consonants from the string
        List<Character> consonants = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (isConsonant(c)) {
                consonants.add(c);
            }
        }

        // Get third last consonant
        int thirdLastIndex = consonants.size() - 3;
        System.out.println(consonants.get(thirdLastIndex));
    }

    private static boolean isConsonant(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) == -1;
    }
}
