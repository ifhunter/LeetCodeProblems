/**
 * Created by ifhunter on 2017/9/18.
 */
import java.util.Arrays;
public class No16_ThreeSumCloset {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int closet = threeSumCloset(nums, target);
        System.out.println("the closet is " + Integer.toString(closet));
    }

    static int threeSumCloset(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int val=0;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++) {
            int low=i+1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - sum) < min) {
                    min = Math.abs(target - sum);
                    val=sum;
                }
                if (target == sum) {
                    return val;
                } else if (target > sum) {
                    low++;
                } else {
                    high--;
                }

            }

        }
        return val;
    }
}
