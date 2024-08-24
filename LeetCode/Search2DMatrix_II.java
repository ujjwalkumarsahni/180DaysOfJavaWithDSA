package LeetCode;
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int n = a.length;
        int m = a[0].length;
        int i = 0, j = m-1;
        while(i<n && j>=0){
            if(a[i][j]==target) return true;
            if(target < a[i][j]){
                j--; //move to left
            }
            else{
                i++; // move to right
            }
        }
        return false;
    }
}
public class Search2DMatrix_II{
    public static void main(String args[]){
        Solution Solution = new Solution();
        int[][] arr ={{1,2,3},{2,5,6},{5,8,9}};
        int t = 5;
        System.out.println(Solution.searchMatrix(arr,t));
    }
}

