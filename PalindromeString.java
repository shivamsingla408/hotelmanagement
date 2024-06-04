import java.util.*;
public class PalindromeString {
    public static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        if(isPalindrome(str))
        {
            System.out.println("Given String is PALINDROME");
        }

        else System.out.println("Given String is NOT PALINDROME");
        sc.close();
    }
}

