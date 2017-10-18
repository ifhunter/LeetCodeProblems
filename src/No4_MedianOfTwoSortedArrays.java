/**
 * Created by ifhunter on 2017/8/28.
 */
public class No4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        No4_MedianOfTwoSortedArrays median = new No4_MedianOfTwoSortedArrays();
        double result = median.findMedianSortedArrays(nums1, nums2);
        System.out.println(Double.toString(result));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lena=nums1.length;
        int lenb=nums2.length;
        int len = lena + lenb;
        if (len % 2 == 0) {
            return ((findMedianCore(nums1, nums2, 0, lena - 1, 0, lenb - 1, len / 2)) +
                    findMedianCore(nums1, nums2, 0, lena - 1, 0, lenb - 1, len / 2 + 1)) / 2;
        } else {
            return findMedianCore(nums1, nums2, 0, lena - 1, 0, lenb - 1, len / 2 + 1);
        }

    }

    public double findMedianCore(int[] A, int[] B, int astart, int aend, int bstart, int bend, int k) {
        int lena=aend-astart+1;
        int lenb=bend-bstart+1;
        if (lena > lenb) {
            return findMedianCore(B, A, bstart, bend, astart, aend,k);
        }
        if (lena <= 0) {
            return B[bstart + k - 1];
        }
        if (k == 1) {
            return A[astart] > B[bstart] ? B[bstart] : A[astart];
        }
        int pa = k / 2 > lena ? lena : k / 2;
        int pb = k - pa;
        if (A[astart + pa - 1] == B[bstart + pb - 1]) {
            return A[astart + pa - 1];
        } else if (A[astart + pa - 1] > B[bstart + pb - 1]) {
            return findMedianCore(A, B, astart, aend, bstart + pb, bend, k - pb);
        } else {
            return findMedianCore(A, B, astart + pa, aend, bstart, bend, k - pa);
        }
    }
}
