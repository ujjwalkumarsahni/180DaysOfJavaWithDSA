class Solution {
    boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int st = 0;
        int end = n * m -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int midEle = arr[mid/m][mid%m];
            if(midEle == target){
                return true;
            }
            if(target < midEle){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;
    }
}
public class Search2DMatrix{
    public static void main(String args[]){
        Solution Solution = new Solution();
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int t = 2;
        System.out.println(Solution.searchMatrix(arr,t));
    }
}
