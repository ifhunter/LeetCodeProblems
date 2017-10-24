/**
 * Created by ifhunter on 2017/10/24.
 */
public class No26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 5, 6, 6, 7};
        int b = removeDuplicates(a);
    }

    private static int removeDuplicates(int[] A) {
        if(A.length==0||A==null)
            return 0;
        int len=1;
        for(int index=1;index<A.length;index++) {
            if (A[index] != A[index - 1]) {
                if(A[index]!=A[len])
                    A[len]=A[index];
                len++;
            }
        }
        return len;
    }
}
