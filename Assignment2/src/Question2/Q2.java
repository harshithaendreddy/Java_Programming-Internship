package Question2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a word to check if it is a palindorme or not:");
        String word = sc.nextLine();
        sc.close();
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String word) {
        String normalizedWord = word.toLowerCase();
        int length = normalizedWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalizedWord.charAt(i) != normalizedWord.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

