/**
 * Created by ifhunter on 2017/9/8.
 */
public class No11_ContainerMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{1, 1};
        No11_ContainerMostWater container = new No11_ContainerMostWater();
        int result = container.maxArea(height);
        System.out.println("the max area is" + Integer.toString(result));
    }

    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int low=0,high=height.length-1;
        int max=0;
        while (low < high) {
            int area = (high - low) * Math.min(height[low], height[high]);
            max = Math.max(max, area);
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }

        }
        return max;
    }
}
