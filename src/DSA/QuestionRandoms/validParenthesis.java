package DSA.QuestionRandoms;
import java.util.*;

public class validParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Fix 1: Use List instead of ArrayList, or create new ArrayList
        List<Character> open = Arrays.asList('(', '{', '[');
        List<Character> close = Arrays.asList(')', ']', '}');

        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        boolean isValid = true;

        for(char c : str.toCharArray()) {
            if(open.contains(c)) {
                stack.push(c);
            }
            else if(close.contains(c)) {
                // Fix 2: Use OR (||) and check empty first
                if(stack.isEmpty() || !map.get(stack.pop()).equals(c)) {
                    isValid = false;
                    break;  // Fix 3: Exit early on invalid
                }
            }
        }

        // Final check: valid only if stack is empty and no errors found
        System.out.println(isValid && stack.isEmpty());
        sc.close();
    }
}
