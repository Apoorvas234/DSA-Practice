import java.util.Scanner;
public class d_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");

        int max = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int[] freq = new int[max + 1];

        for(int num : arr) {
            freq[num]++;
        }

        System.out.println("Frequency of elements:");

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }


    }
}