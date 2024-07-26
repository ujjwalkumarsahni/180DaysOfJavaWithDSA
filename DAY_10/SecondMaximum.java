public class SecondMaximum {

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

    static int secondMax(int []arr){
        int max = maxValue(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == max){
                max = Integer.MIN_VALUE;
            }
        }
        return maxValue(arr);

    }
    public static void main(String args){
        int[] arr = {2,3,56,3,6,100};
        int ans = maxValue(arr);
        System.out.println("Maximum value : " + ans);
        int ans2 = secondMax(arr);
        System.out.println("Second Maximu value : " + ans2);

    }
}

