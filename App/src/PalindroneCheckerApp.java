import java.util.Scanner;

public class PalindroneCheckerApp {

    // Method 1: Using StringBuilder reverse()
    public static boolean checkUsingReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Method 2: Using Two Pointer Technique
    public static boolean checkUsingTwoPointer(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(input.charAt(left)) !=
                    Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // ---- Algorithm 1 ----
        long startTime1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;

        // ---- Algorithm 2 ----
        long startTime2 = System.nanoTime();
        boolean result2 = checkUsingTwoPointer(input);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;

        // ---- Output ----
        System.out.println("\nInput: " + input);
        System.out.println("Is Palindrome (Reverse Method): " + result1);
        System.out.println("Execution Time (Reverse Method): " + executionTime1 + " ns");

        System.out.println("\nIs Palindrome (Two Pointer Method): " + result2);
        System.out.println("Execution Time (Two Pointer Method): " + executionTime2 + " ns");

        scanner.close();
    }
}