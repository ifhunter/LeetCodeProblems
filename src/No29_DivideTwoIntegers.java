/**
 * Created by ifhunter on 2017/11/2.
 */
public class No29_DivideTwoIntegers {
    public static void main(String[] args) {
        int a,b;
        a=-2147483648;
        b=-1;
        int c = divide(a, b);
    }

    static int divide(int dividend, int divisor) {
        if(dividend==0||divisor==0)
            return 0;
        boolean isNeg = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        if(b>a)
            return 0;
        long sum=0;
        long pow=0;
        int result=0;
        while(a>=b){
            pow=1;
            sum=b;
            while(sum+sum<a){
                sum+=sum;
                pow+=pow;
            }
            a-=sum;
            result+=pow;
            if((result>=Integer.MAX_VALUE)&&(!isNeg))
                break;
        }
        return isNeg? -result:result;
    }
}
