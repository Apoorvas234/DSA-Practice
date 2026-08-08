import java.util.*;
public class d_search{
    public static void main(String[] args){
         int[] arr = {12,23,14,53,6,7};
         int target = 12;
         int found = -1;                  //means target array m nhi h.
         for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                found = i; 
                break;     
            }
         }
         if(found!=-1) System.out.println("Target exists in Array at index " + found);
         else System.out.println("Target missing in Array");


         


    }
}