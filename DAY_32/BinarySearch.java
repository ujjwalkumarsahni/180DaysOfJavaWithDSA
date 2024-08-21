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

    static boolean RecursiveBinarySearch(int[] arr,int st,int end,int target){
        if(st>end){
            return false;
        }
        int mid = (st+end)/2;
        if(target==arr[mid]){
            return true;
        }
        else if(target<arr[mid]){
            return RecursiveBinarySearch(arr,st,mid-1,target);
        }
        else{
            return RecursiveBinarySearch(arr,mid+1,end,target);
        }

    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int target = 10;
        
        System.out.println(binarySearch(arr,target));
        System.out.println(RecursiveBinarySearch(arr,0,arr.length-1,target));
    }
}