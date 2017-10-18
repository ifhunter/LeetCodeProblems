/**
 * Created by ifhunter on 2017/8/22.
 */
import java.util.*;

public class No1_TwoSum {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,5,7,4,8,13};
        int target=13;
        No1_TwoSum sum = new No1_TwoSum();
        int result1[] = sum.twoSum1(nums,target);
        System.out.println("Use Brute Force get the result: " + Integer.toString(nums[result1[0]])+"+"+Integer.toString(nums[result1[1]])+"="+Integer.toString(target));
        int result2[] = sum.twoSum2(nums,target);
        System.out.println("Use Brute Force get the result: " + Integer.toString(nums[result2[0]])+"+"+Integer.toString(nums[result2[1]])+"="+Integer.toString(target));
        int result3[] = sum.twoSum3(nums,target);
        System.out.println("Use Brute Force get the result: " + Integer.toString(nums[result3[0]])+"+"+Integer.toString(nums[result3[1]])+"="+Integer.toString(target));

    }

    public int[] twoSum1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
