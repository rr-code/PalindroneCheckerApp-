

import java.util.Scanner;

public class PalindroneCheckerApp {


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
    String input = sc.nextLine();

    // Convert string to lowercase (optional for case-insensitive check)
    input = input.toLowerCase();

    // Convert string to character array
    char[] charArray = input.toCharArray();

    int start = 0;
    int end = charArray.length - 1;

    boolean isPalindrome = true;

    // Two-pointer approach
        while (start < end) {
        if (charArray[start] != charArray[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    // Output result
        if (isPalindrome) {
        System.out.println("The given string is a Palindrome.");
    } else {
        System.out.println("The given string is NOT a Palindrome.");
    }

        sc.close();
    }
}