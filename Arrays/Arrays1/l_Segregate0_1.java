class Solution {
    public static void segregate0_1(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } 
            else if (arr[j] == 1) {
                j--;
            } 
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
    }
}

public class l_Segregate0_1 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};

        Solution.segregate0_1(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}