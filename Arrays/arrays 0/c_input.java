
import java.util.*;
class c_input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        //default values of array elements
        for(int i =0;i<7;i++){
            System.out.println(arr[i]);       //all the elements equal to 0

        }

        //input
        for(int i =0;i<7;i++){
            arr[i] = sc.nextInt();
        }
        //print
        for(int i =0;i<7;i++){
            System.out.print(arr[i]+" ");
        


        }

    }
}