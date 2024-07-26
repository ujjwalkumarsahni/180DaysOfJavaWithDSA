public class RepetingFirstValue{

    static int repetingFirstNumber(int []arr){
        for(int i = 0; i < arr.length; i++){ //first number 
            for(int j = i+1; j < arr.length; j++){ //second number
                if(arr[i] == arr[j]){ //found number
                    return arr[i];
                }
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int[] arr = {3,4,5,6,5,7,6};
        int ans = repetingFirstNumber(arr);
        System.out.println("First Repeting Number : "+ans);
    }
}