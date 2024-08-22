public class FindMinimum {
    static int FindMin(int[] a){
        int n = a.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid]<a[n-1]){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] a = {4,5,1,2,3};
        System.out.println(FindMin(a));
    }
}
