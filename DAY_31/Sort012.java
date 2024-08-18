
public class Sort012 {

    static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if(arr[mid] == 0){
                swap(arr, mid, lo);
                mid++;
                lo++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 0, 1, 2, 0, 1, 2, 1};
        sort(arr);
        print(arr);

    }
}
