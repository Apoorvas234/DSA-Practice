//Given an array print negative elements only.

import java.util.*;
public class d_practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //size of array input
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        //built an array
        int[] arr = new int[n];

        //input of elemets in array.
        System.out.print("Enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
         
           System.out.print("Negative elements are :");
           boolean flag = false;
        //printing array
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+ " ");
                flag = true;
            }
          
        }
        if(flag == false){
            System.out.println("0");
        }
      
    }
}