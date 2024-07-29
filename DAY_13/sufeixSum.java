public class sufeixSum {
    public static int[] calculateSuffixSums(int[] arr) {
        int n = arr.length;
        int[] suffixSums = new int[n];
 
        suffixSums[n - 1] = arr[n - 1];
 
        for (int i = n - 2; i >= 0; i--) {
            suffixSums[i] = arr[i] + suffixSums[i + 1];
        }

        return suffixSums;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = calculateSuffixSums(arr);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
