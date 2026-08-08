import java.util.*;
public class b_sort{
    public static void main(String[] args){
        int[] arr = {6,4,8,7,3,9,2};
        print(arr);
        Arrays.sort(arr);
        print(arr);
        }
        
        public static void print(int[] arr){
             for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+" "); 

             }
             System.out.println(); 

        }

}