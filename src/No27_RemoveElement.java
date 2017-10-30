/**
 * Created by ifhunter on 2017/10/30.
 */
public class No27_RemoveElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 5, 6, 6, 7};
        int b = removeElement(a,1);
    }
    static int removeElement(int[] A,int elem) {
        if(A==null||A.length==0)
            return 0;
        int len=0;
        for(int i=0;i<A.length;i++) {
            if (A[i] != elem) {
                if(A[len]!=A[i])
                    A[len]=A[i];
                len++;
            }
        }
        return len;
    }
}
