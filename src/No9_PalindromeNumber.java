/**
 * Created by ifhunter on 2017/9/5.
 */
public class No9_PalindromeNumber {
    public static void main(String[] args) {
        int num=121;
        No9_PalindromeNumber pal = new No9_PalindromeNumber();
        boolean isPalindrome = pal.isPalindrome(num);
        if (isPalindrome) {
            System.out.println(Integer.toString(num) + "is palindrome number.");
        }else{
            System.out.println(Integer.toString(num) + "is not palindrome number");
        }
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int div=1;
        while (x / div >= 10) {
            div*=10;
        }
        while (x != 0) {
            int left=x/div;
            int right=x%10;
            if(left!=right)
                return false;
            x=(x%div)/10;
            div/=100;
        }
        return true;
    }
}
