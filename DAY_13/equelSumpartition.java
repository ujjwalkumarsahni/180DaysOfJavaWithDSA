public class equelSumpartition{
    static int FindArraySum(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i = 0;i<n;i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean  EquelSumPartition(int[] arr){
        int totalSum = FindArraySum(arr);
        int n = arr.length;
        int prefix = 0;
        for(int i = 0;i<n;i++){
                prefix += arr[i];
                int sufexSum = totalSum - prefix;
                if(prefix == sufexSum){
                    return  true;
                }
        } 
        return  false;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,2};
        System.out.println(EquelSumPartition(arr));
    }
}