public class sortSquers {
    static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] SortSquers(int []arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int k = 0;
        int[] ans = new int[n];
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left]; 
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;

    }
    static int[]  revers(int[] arr){
        int n = arr.length;
        int k = 0;
        int []ans = new int[n];
        for(int i = n-1;i>=0;i--){
            ans[k++] = arr[i];
        }
        return ans; 
    }
    public static void main(String args[]){
        int []arr = {-10,-3,-2,4,5};
        int []sqr = SortSquers(arr);
        printArray(sqr);
        int []ans = revers(sqr);
        printArray(ans);
    }
}
