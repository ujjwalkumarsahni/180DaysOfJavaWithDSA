public class SumOfArray{

    static int sumOfArray(int[] arr, int idx){
        // base case
        if(idx == arr.length){
            return 0;
        }

        // recusrive work
        int smallAns = sumOfArray(arr,idx+1);

        // self work
        return smallAns + arr[idx];
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4};
        int idx = 0;

        System.out.println(sumOfArray(arr, idx));
    }
}


