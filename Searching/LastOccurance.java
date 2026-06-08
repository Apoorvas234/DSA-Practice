class LastOccurance{
    public int Occurance(int[] arr,int target){
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
        LastOccurance obj = new LastOccurance();
        int arr[] = {3,4,5,6,7,7,7,8};
        int ans = obj.Occurance(arr,7);
        System.out.println(ans);

    }


}