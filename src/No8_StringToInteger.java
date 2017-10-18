/**
 * Created by ifhunter on 2017/9/4.
 */
public class No8_StringToInteger {
    public static void main(String[] args) {
        String str = " -435 ";
        No8_StringToInteger conv = new No8_StringToInteger();
        int ret = conv.atoi(str);
        System.out.println(Integer.toString(ret));

    }

    public int atoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        str = str.trim();
        char flag = '+';
        int i=0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        double result=0;
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (flag == '-') {
            result=-result;
        }
        if (result > Integer.MAX_VALUE) {
            result=Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            result=Integer.MIN_VALUE;
        }
        return (int)result;
    }
}

