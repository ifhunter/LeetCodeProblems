/**
 * Created by ifhunter on 2017/9/13.
 */
public class No14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"book", "boot", "bottle"};
        String res = longestCommonPrefix(strs);
        System.out.println("the longest common prefix string is" + res);
    }

    static String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null)
            return "";
        for(int i=0;i<strs[0].length();i++) {
            char x = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++) {
                if(strs[j].length()==i||strs[j].charAt(i)!=x)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
