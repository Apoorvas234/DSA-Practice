class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<x){
                low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
             if(arr[mid]==x){
                 index = mid;
                 high = mid-1;
            }
        }
        ans.add(index);
        
        low = 0;
        high = n-1;
        index = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<x){
                low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
             if(arr[mid]==x){
                 index = mid;
                 low = mid+1;
            }
        }
        ans.add(index);
        return ans;
    }
}
