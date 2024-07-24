public class copyArray{
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 43;
        arr[2] = 48;
        arr[3] = 24;
        arr[4] = 13;

        // printArray(arr);

        // int[] arr_2 = arr;
        int[] arr_2 = arr.clone();

        printArray(arr);

        arr_2[0] = 1000;
        printArray(arr);

        printArray(arr_2);
    }
}