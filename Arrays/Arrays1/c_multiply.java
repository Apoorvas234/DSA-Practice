//Multiply odd indexed elements by 2 and add 10 to even indexed element.

import java.util.*;
public class c_multiply{
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
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] += 10;
            }
            else {
                arr[i] *= 2;
            }
           
         }

         //print updated array
         for(int i =0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
    }
}
