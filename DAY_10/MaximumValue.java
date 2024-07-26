public class MaximumValue {

    static int maxValue(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i]; 
            } 
        }
        return max;

    }
    public static void main(String args[]){
        int[] arr = {2,3,56,3,6,7,100};
        int ans = maxValue(arr);
        System.out.println(ans);
    }
}
