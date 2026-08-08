import java.util.*;
public class j_Rotate{
 static void reverse(int[] arr,int i,int j){
    while (i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}

static void rotate(int[] arr, int d){
    int n = arr.length;
    d %= n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int d = sc.nextInt();
    rotate(arr,d);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}
}