public class ReverseTheArray {
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        return  ans;
    }
    static void reverse(int []arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        } 
    }
    static void swapArray(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,5};
        reverse(arr);      
        printArray(arr);  
    }
}
