class Solution {
    public int peakIndex(int[] arr) {
        int n = arr.length;
        int st = 0,end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid + 1;
                st = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
public class PeakIndexInMountainArray{
    public static void main(String args[]){
        Solution Solution2 = new Solution();
        int[] arr = {1,2,3,4,5,6,5,3};
        System.out.println(Solution2.peakIndex(arr));
    }
}


