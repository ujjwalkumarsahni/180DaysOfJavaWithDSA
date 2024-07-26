public class TargetTripletSum {
    static int pairTripletSum(int[] arr , int target){
        int ans = 0;
        int n = arr.length;
        for(int i = 0;i < n; i++){ // first Number 
            for(int j = i+1; j < n; j++){ // Second Number
                for(int k = j+1;k < n; k++){  // Third number
                    if(arr[i] + arr[j] + arr[k] == target){

                        ans++;
                    }
                }
            }
        }
        return ans;
    } 
    public static void main(String args[]){
        int[] arr = {4,5,6,7,3,2,9};
        int target = 12;
        int ans = pairTripletSum(arr,target);
        System.out.println("Triplet Sum : " + ans);
    }
}
