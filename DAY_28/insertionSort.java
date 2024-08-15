
public class insertionSort {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void InsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 &&  arr[j]<arr[j- 1 ]){   
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }
    
    public static void main(String args[]) {
        int[] arr = {5, 30, 6, 1, 4};
        printArray(arr);
        InsertionSort(arr);
        printArray(arr);
    }
}
