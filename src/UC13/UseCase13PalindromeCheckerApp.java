package UC13;
public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String processedInput = input.toLowerCase();

        long startTime = System.nanoTime();

        // Simple loop-based algorithm for performance check
        boolean isPalindrome = true;
        for (int i = 0; i < processedInput.length() / 2; i++) {
            if (processedInput.charAt(i) != processedInput.charAt(processedInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }
}
