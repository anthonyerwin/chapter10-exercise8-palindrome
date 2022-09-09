import java.util.Scanner;

public class Palindrome {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {        

        String str;
        //String str = "Never odd or even";
        System.out.println("Enter String: ");
        str = scanner.nextLine();

        //Change strings to lowercase and removes all space
        str = str.toLowerCase().replace(" ", "");
 
        if (isPalindrome(str))
            System.out.print("String is a palindrome\n");
        else
            System.out.print("String is not a palindrome\n");
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
}
