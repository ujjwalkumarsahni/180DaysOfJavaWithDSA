
public class LinearSearchUsingRecursion {

    static boolean Search(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return false;
        }

        // self work
        if (arr[idx] == target) {
            return true;
        }

        // Recursive work
        if (Search(arr, n, target, idx + 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 3, 6};
        int target = 40;

        if (Search(arr, arr.length, target, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
