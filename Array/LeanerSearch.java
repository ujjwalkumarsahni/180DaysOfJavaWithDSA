public class LeanerSearch{

    static int Search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int []arr = {2,4,5,63,7};
        int n =arr.length,x=400;
        System.out.println(Search(arr,n,x));
    }
}