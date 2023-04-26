public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        // || means logical OR
        // && means logical AND
        // != means not equal to
        if(x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int r = 0;

        while (x > r) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r == x || r / 10 == x;
    }
}
