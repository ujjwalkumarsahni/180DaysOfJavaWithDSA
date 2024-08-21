public class FirstOccurence{
    static int first(int[] arr,int x){
        int n = arr.length;
        int st = 0,end = n-1;
        int fo = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid]==x){
                fo = mid;
                end = mid-1;
            }
            else if(x<arr[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return fo;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,3,3,5,6};
        int x = 3;
        System.out.println(first(arr,x));
    }
}