public class ArrayRecursion{
    static void PrintArrayUsingRecursion(int[] arr,int idx){
        // base case
        if(idx == arr.length){
            return;
        }

        // self work
        System.out.println(arr[idx]);
        // recursive work
        PrintArrayUsingRecursion(arr,idx+1);
        
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int idx = 0;
        PrintArrayUsingRecursion(arr,idx);
    }
}



