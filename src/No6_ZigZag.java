/**
 * Created by ifhunter on 2017/8/30.
 */
public class No6_ZigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        No6_ZigZag zigzag = new No6_ZigZag();
        String result = zigzag.convert(s, 3);
        System.out.println("zigzag convention of" + s + "is " + result);
    }

    public String convert(String s, int numRows) {
        int len = s.length();
        if(len==0||numRows<2||len<=numRows) return s;
        String ret="";
        int lag = 2 * numRows - 2;
        for(int i=0;i<len;i+=lag) {
            //处理第一行
            ret += s.charAt(i);
        }
        for(int i=1;i<numRows-1;i++) {
            //处理中间行
            int j=i;
            ret += s.charAt(j);
            int lag2 = lag - 2 * i;
            while (j < len) {
                j += lag2;
                if(j<len)
                ret += s.charAt(j);
                j += 2 * i;
                if(j<len)
                ret += s.charAt(j);
            }
        }
        for(int i=numRows-1;i<len;i+=lag) {
            //处理最后一行
            ret += s.charAt(i);
        }

        return ret;
    }
}
