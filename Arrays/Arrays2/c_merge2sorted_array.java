import java.util.*;
public class c_merge2sorted_array {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int n1 = a.length;
        int n2 = b.length;

        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                mergedArray[k++] = a[i++];
            } else {
                mergedArray[k++] = b[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = a[i++];
        }

        while (j < n2) {
            mergedArray[k++] = b[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}