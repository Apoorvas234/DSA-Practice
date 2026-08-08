public class i_reverse{
    public static void main(String[] args){
        int[] arr = {3,4,5,6,1};
        int n = arr.length;
        int i =0,j=n-1;                    //Two pointer technique
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}