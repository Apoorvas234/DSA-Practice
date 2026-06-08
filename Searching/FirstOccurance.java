public class FirstOccurance{
    public int occurance(int arr[],int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<target){
                low = mid+1;
                 }
            else if(arr[mid]>target){
                high = mid-1;
                 }
            else if(arr[mid]==target){
                index = mid;
                low = mid+1;

            }
                
        }
        return index;
    }

public static void main(String[] args){
   FirstOccurance obj = new FirstOccurance();

    int[] arr = {2,4,5,6,6,7,8};
    int ans = obj.occurance(arr,6);
    System.out.println(ans);
}
}