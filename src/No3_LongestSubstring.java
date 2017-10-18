
/**
 * Created by ifhunter on 2017/8/24.
 */
import java.util.*;
public class No3_LongestSubstring  {
    public static void main(String[] args) {
        No3_LongestSubstring substring = new No3_LongestSubstring();
        String string = "abcabcbb";
        int length1 = substring.lengthOfLongestSubstring1(string);
        System.out.println("The length of the longest substring is "+Integer.toString(length1));
        int length2 = substring.lengthOfLongestSubstring2(string);
        System.out.println("The length of the longest substring is "+Integer.toString(length2));
        int length3 = substring.lengthOfLongestSubstring3(string);
        System.out.println("The length of the longest substring is "+Integer.toString(length3));

    }

    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<=n;j++) {
                if(allUnique(s,i,j)) ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for(int i=start;i<end;i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return  true;
    }
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans=0,i=0,j=0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    public int lengthOfLongestSubstring3(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j=0,i=0;j<n;j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
