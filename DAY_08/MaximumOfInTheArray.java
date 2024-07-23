class Maximum {
    void MaximumNumber(){
        int[] arr = {3,4,67,300,7,100};
        int ans = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);

    }
}
public class MaximumOfInTheArray {
    public static void main(String[] args){
        Maximum obj = new Maximum();
        obj.MaximumNumber();
    }
}
