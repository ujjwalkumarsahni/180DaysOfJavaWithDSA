public class SecondLongestElement{
    public static int SecondMax(int[] arr,int n){
        int firstLargest = arr[0];
        int secondLargest = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]<firstLargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }
    public static void main(String args[]){
        int[] arr = {4,5,6,23,2,7};

        int ans = SecondMax(arr,arr.length);
        System.out.print(ans);
    }
}