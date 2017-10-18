import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ifhunter on 2017/8/31.
 */
public class No7_ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        No7_ReverseInteger rev = new No7_ReverseInteger();
        int result1 = rev.reverse1(x);
        System.out.println(Integer.toString(result1));
        int result2 = rev.reverse12(x);
        System.out.println(Integer.toString(result2));
    }

    public int reverse1(int x) {
        Queue<Integer> q = new LinkedList<Integer>();
        int count=0;
        while (x != 0) {
            count++;
            int r=x%10;
            q.add(r);
            x=(x-r)/10;
        }
        int nx=0;
        for(int i=count;i>0;i--) {
            int temp = q.poll();
            int j=i;
            int carry=1;
            while (j > 1) {
                carry=carry*10;
                j--;
            }
            nx = nx + temp * carry;
        }
        return nx;
    }

    public int reverse12(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int num = Math.abs(x);
        int res=0;
        while (num != 0) {
            if(res>(Integer.MAX_VALUE-num%10)/10)
                return 0;
            res=res*10+num%10;
            num/=10;
        }
        return x > 0 ? res : -res;
    }
}
