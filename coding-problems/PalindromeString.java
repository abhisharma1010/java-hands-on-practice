public class PalindromeString {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Madam";
        System.out.println("Is Palindrome: " + isPalindrome(s));
    }
}
