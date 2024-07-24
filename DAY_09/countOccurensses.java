public class countOccurensses {
    static int countX(int[] arr ,int x){

        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr = {2,3,5,4,5,7,5};
        int x = 7;
        System.err.println(countX(arr, x));
    }
}
