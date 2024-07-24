public class LastOccurences {
    static int LastNumberOfXindex(int[] arr , int x){
        int LastIndex = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                LastIndex = i;
            }
        }
        return  LastIndex;
    }
    public static void main(String args[]){
        int[] arr = {3,4,6,7,4,4};
        int x = 4;
        System.out.print(LastNumberOfXindex(arr,x));
    }
}
