public class IsSorted {
    static boolean  isSorted(int[] arr){
        boolean check = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String args[]){
        int[] arr = {3,3,5,6,7};
        System.out.println(isSorted(arr));
    }
}
