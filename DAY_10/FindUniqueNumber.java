public class FindUniqueNumber {
    static int findUnique(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = arr[j] = -1;
                }
            }
        }
        int ans = 0; 
        for(int i = 0;i<n;i++){
            if(arr[i] != -1){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,2,3,1};
        int ans = findUnique(arr);
        System.out.println("Unique value : " + ans); 
    }
}
