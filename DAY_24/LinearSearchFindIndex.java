public class LinearSearchFindIndex {
    static int SearchFindIndex(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return -1;
        }

        // self work
        if (arr[idx] == target) {
            return idx;
        }

        // Recursive work
        return SearchFindIndex(arr, n, target, idx + 1); 
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 3, 6};
        int target = 4;

        System.out.println(SearchFindIndex(arr, arr.length, target, 0));
    }
}
