public class BinarySearch{
    static boolean binarySearch(int[] arr,int t){
        int n = arr.length;
        int st = 0,end = n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(t == arr[mid]){
                return true;
            }
            else if(t<arr[mid]){
                end = mid-1;
            }
            else{
                st = mid+1; 
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int target = 4;

        System.out.println(binarySearch(arr,target));
    }
}