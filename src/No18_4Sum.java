/**
 * Created by ifhunter on 2017/9/20.
 */
import java.util.*;
public class No18_4Sum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> b = new ArrayList<List<Integer>>();
        b = fourSum(nums, 0);
        System.out.println(b);
    }

    static List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> st = new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        if(num.length<=3)
            return st;
        Arrays.sort(num);
        int sum;
        for(int i=0;i<num.length-3;i++) {
            for(int j=i+1;j<num.length-2;j++) {
                int low=j+1;
                int high=num.length-1;
                while (low < high) {
                    sum = num[i] + num[j] + num[low] + num[high];
                    if (sum == target) {
                        ArrayList<Integer> a = new ArrayList<Integer>();
                        a.add(num[i]);
                        a.add(num[j]);
                        a.add(num[low]);
                        a.add(num[high]);
                        if (!set.contains(a)) {
                            set.add(a);
                            st.add(a);
                        }
                        low++;
                        high--;
                    } else {
                        if (sum < target) {
                            low++;
                        } else {
                            high--;
                        }
                    }
                }
            }
        }
        return st;
    }
}
