import java.util.Scanner;


public class PalindroneCheckerApp {

    // Application entry point
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome check method
        boolean result = service.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        // Convert to lowercase (optional improvement)
        input = input.toLowerCase();

        // Initialize pointers (as shown in hint on Page 2)
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}