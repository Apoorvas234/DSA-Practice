class BinarySearch{
    public int search(int arr[],int target){
        int n = arr.length;
        int low = 0 ,high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target){
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearch obj = new  BinarySearch();

        int[] arr = {1,3,6,7,8,9,23,67,89,98};
        int ans = obj.search(arr,67);

        System.out.println(ans);
    }
}