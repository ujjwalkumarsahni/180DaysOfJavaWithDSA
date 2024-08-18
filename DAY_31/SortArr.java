public class SortArr{
    static void print(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    static void sortArr(int[] arr){
        int n = arr.length;
        int x = -1;
        int y = -1;
        if(n<=1){
            return;
        }
        for(int i = 1;i<n;i++){
            if(arr[i-1] > arr[i]){
                if(x == -1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String args[]){
        int[] arr = {10,5,6,7,8,9,3};
        sortArr(arr);
        print(arr);
    }
}