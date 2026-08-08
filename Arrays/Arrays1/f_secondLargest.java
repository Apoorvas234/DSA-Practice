public class g_secondLargest{
    public static void main(String[] args){
        int[] arr = {4,10,10,8,6,5};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
               max = arr[i];
            }
         }

        for(int i=0;i<arr.length;i++){
            if(arr[i]> second_max && arr[i] !=max){
               second_max = arr[i];
            }
        }
         
         
    
    System.out.print(second_max);
    }
}

