public class RotatedSortedArray {
    static int Search(int[] a,int t){
        int n = a.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid] == t){
                return mid;
            }
            else if(a[mid]<a[end]){
                if(t>a[mid] && t<=a[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(t>=a[st] && t<a[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return -1;

    }

    // Duplicate number
    static int Search_(int[] a,int t){
        int n = a.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid] == t){
                return mid;
            }
            else if(a[st]==a[mid] && a[end]==mid){
                st++;
                end--;
            }
            else if(a[mid]<=a[end]){
                if(t>a[mid] && t<=a[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(t>=a[st] && t<a[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return -1;

    }
    public static void main(String args[]){
        // int[] a = {3,4,5,1,2};
        // int t = 4;
        // System.out.println(Search(a,t));
        int[] a = {1,1,1,2,2,3,1};
        int t = 2;
        System.out.println(Search_(a,t));
    }
}
