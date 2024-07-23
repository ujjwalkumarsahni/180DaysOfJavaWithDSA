
public class SearchGivenElementInTheArray {
    static void Search(){
        int[] arr = {2,33,5,7,7,3};
        int x = 5;
        int ans = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == x){
                ans = i;
            }
             
        }
        System.out.println("Index : " + ans);
    }
    public static void main(String args[]){
        Search();
    }
    
}
