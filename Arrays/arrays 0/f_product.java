import java.util.*;
public class f_product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //array size
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();

        //array built
        int[] arr = new int[n];

        //elements input
        System.out.print("Enter the an element of an Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            }

        //logic
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
         }
        System.out.print(product);
        }
}
