public class LinearSearchFindAllIndices {
    static void SearchFindIndex(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return;
        }

        // self work
        if (arr[idx] == target) {
            System.out.println(idx);
        }

        // Recursive work
        SearchFindIndex(arr, n, target, idx + 1); 
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 3, 6, 4, 4, 9, 4};
        int target = 4;
        SearchFindIndex(arr, arr.length, target, 0);
    }
}
