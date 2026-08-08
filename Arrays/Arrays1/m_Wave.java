class solution {
    public static void segregate0_1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}

public class m_Wave {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        solution.segregate0_1(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}