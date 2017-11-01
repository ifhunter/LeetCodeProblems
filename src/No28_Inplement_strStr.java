/**
 * Created by ifhunter on 2017/11/1.
 */
public class No28_Inplement_strStr {
    public static void main(String[] args) {
        String str1 = "adlkjasdhsdkkh";
        String str2 = "sd";
        int res = strStr(str1, str2);
        System.out.println(Integer.toString(res));
    }

    static int strStr(String haystack, String needle) {
        for(int i=0;;i++) {
            for(int j=0;;j++) {
                if(j==needle.length()) return i;
                if(i+j==haystack.length()) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }
    }
}
