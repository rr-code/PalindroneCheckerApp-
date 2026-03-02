import java.util.Scanner;


public class PalindroneCheckerApp {

    // Application entry point
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase (optional improvement)
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    // Recursive method to check palindrome
    private static boolean check(String s, int start, int end) {

        // Base condition: if start crosses end
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}