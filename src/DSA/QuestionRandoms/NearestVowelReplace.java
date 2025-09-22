package DSA.QuestionRandoms;

public class NearestVowelReplace {
    static char [] vowels = {'a','e','i','o','u'};

    public static boolean isVowel(char ch) {
        for (char vowel : vowels) {
            if (ch == vowel) {
                return true;
            }
        }
        return false;
    }

    public static char nearestVowel(char ch) {
        char nearest = 'a' ;
        int minDiff = Integer.MAX_VALUE;

        for(char vowel : vowels) {
            int diff = Math.abs(ch - vowel);
            if (diff < minDiff || (diff == minDiff && vowel< nearest)) {
                minDiff = diff;
                nearest = vowel;
            }
        }
        return nearest;
    }
    public static String convert(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) sb.append(c);
            else sb.append(nearestVowel(c));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "greiay";
        System.out.println(convert(s));  // Output: eoieau
    }
}

