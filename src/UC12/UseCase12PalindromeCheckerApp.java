package UC12;
import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        // Strategy can be injected at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(input.toLowerCase());

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}