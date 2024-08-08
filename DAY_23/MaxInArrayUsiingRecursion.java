import java.util.*;
public class MaxInArrayUsiingRecursion {
    static int maxInArray(int[] arr,int idx){
        // base case
        if(idx == arr.length-1){
            return arr[idx];
        }

        // recursive work
        int smallAns = maxInArray(arr,idx+1);

        // self work
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String args[]){
        int[] arr = {2,5,4,8,61};
        int idx = 0;
        System.out.println(maxInArray(arr,idx));
    }
}
