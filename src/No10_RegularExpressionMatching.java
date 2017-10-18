/**
 * Created by ifhunter on 2017/9/6.
 */
public class No10_RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "ba";
        String p = "a*b";
        No10_RegularExpressionMatching match = new No10_RegularExpressionMatching();
        boolean result = match.isMatch(s, p);
        if (result)
            System.out.println(s + " match " + p);
    }

    public boolean isMatch(String s, String p) {
        if (p.length() == 0)
            return s.length() == 0;
        if(p.length()==1)
            return (s.length()==1)&&((p.charAt(0)==s.charAt(0))||p.charAt(0)=='.');
        if (p.charAt(1) != '*') {
            if (s.length() == 0)
                return false;
            else
                return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));

        } else {
            while (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
                if(isMatch(s,p.substring(2)))
                    return true;
                s=s.substring(1);
            }
            return isMatch(s, p.substring(2));
        }



    }
}
