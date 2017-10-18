/**
 * Created by ifhunter on 2017/8/29.
 */
public class No5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        No5_LongestPalindromicSubstring palindromic = new No5_LongestPalindromicSubstring();
        String result = palindromic.longestPalindrome(s);
        System.out.println("the longest palindrome substring of " + s + "is " + result);
    }

    public String longestPalindrome(String s) {
        int start =0,end=0;
        for(int i=0;i<s.length();i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L=left,R=right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R-L-1;
    }
}
