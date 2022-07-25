package per.kim;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int y = 0;
        int orgX = x;

        if (x < 0) {
            return false;
        }
        else {
            while (x > 0) {
                y = y * 10 + (x % 10);
                x = x / 10;
            }
            return orgX == y;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(999));
        System.out.println(isPalindrome(1004));
        System.out.println(isPalindrome(2147483647));
    }
}
