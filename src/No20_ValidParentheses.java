/**
 * Created by ifhunter on 2017/9/27.
 */
import java.util.*;
public class No20_ValidParentheses {
    public static void main(String[] args) {
        String s="{[}]";
        boolean res = isValid(s);
        if (res) {
            System.out.println(s + "is valid");
        }else{
            System.out.println("is not valid");
        }
    }

    static boolean isValid(String s) {
        if(s.length()==0||s.length()==1)
            return false;
        Stack<Character> x = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                x.push(s.charAt(i));
            } else {
                if(x.size()==0)
                    return false;
                char top = x.pop();
                if(s.charAt(i)==')') {
                    if (top != '(')
                        return false;
                } else if(s.charAt(i)=='}') {
                    if (top != '{')
                        return false;
                }else if(s.charAt(i)==']') {
                    if (top != '[')
                        return false;
                }
            }
        }
        return x.size()==0;

    }
}
