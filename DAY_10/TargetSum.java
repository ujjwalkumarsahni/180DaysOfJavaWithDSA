public class TargetSum{
    static int pairSum(int[] arr,int target){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){ // first number
            for(int j = i+1; j<arr.length;j++){ // second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int target = 7;
        int ans = pairSum(arr,target);
        System.out.println("Target sum : " + ans);
    }
}
