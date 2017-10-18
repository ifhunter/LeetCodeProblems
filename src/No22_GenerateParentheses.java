/**
 * Created by ifhunter on 2017/10/17.
 */

import java.util.ArrayList;
import java.util.Arrays;
public class No22_GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> res =new ArrayList<String>();
                res=generateParenthesis(n);
    }

    static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        String item = new String();
        if(n<=0)
            return res;
        dfs(res, item, n, n);
        return res;
    }

    static void dfs(ArrayList<String> res, String item, int left, int right) {
        if (left > right)
            return;
        if (left == 0 && right == 0) {
            res.add(new String(item));
            return;
        }
        if(left>0)
            dfs(res, item + '(', left - 1, right);
        if(right>0)
            dfs(res, item + ')', left, right - 1);
    }
}
