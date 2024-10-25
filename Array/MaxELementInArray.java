public class MaxELementInArray {


    // Linear Search Approach
    static int Max(int[] arr,int n){
        int max = arr[0];

        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    
    public static void main(String args[]){
        int[] arr = {2,5,3,6,8,1,32,3};
        int n = arr.length;
        int ans = Max(arr,n);
        System.out.print(ans);
    }
}
