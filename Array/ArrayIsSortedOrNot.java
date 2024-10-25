public class ArrayIsSortedOrNot{

    static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5};

        boolean ans = isSorted(arr);
        System.out.print(ans);
    }
}