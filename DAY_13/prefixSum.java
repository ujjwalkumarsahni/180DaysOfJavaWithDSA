public class prefixSum{
    static void PrintArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] PrefixSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i]; 
        }
        return prefix;
    }
    static int[] PrefixSumWithoutcopyArray(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            arr[i] +=   arr[i-1]; 
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr = {2,3,1,4,5};
        int[] ans = PrefixSum(arr);
        PrintArray(ans);

        // SECOND APROCH
        int[] ans2 = PrefixSumWithoutcopyArray(arr);
        PrintArray(ans2);
    }
}