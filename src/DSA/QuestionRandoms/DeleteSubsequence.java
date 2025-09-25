package DSA.QuestionRandoms;


import java.util.*;

public class DeleteSubsequence {
    public static int smallestStringLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                // check if top+current forms "AB" or "CD"
                if ((top == 'A' && c == 'B') || (top == 'C' && c == 'D')) {
                    stack.pop(); // cancel the pair
                    continue;
                }
            }
            stack.push(c); // else, push the character
        }

        return stack.size(); // final reduced length
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim()); // read length
        String s = sc.nextLine().trim();

        System.out.println(smallestStringLength(s));
    }
}
