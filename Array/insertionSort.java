public class insertionSort {

    public static void InsertionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                swap(arr,j-1,j);

                j--;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        InsertionSort(arr,arr.length);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}


/***
 Initial array: [5, 3, 8, 4, 2]
n = 5

Iteration 1 (i = 0):
i = 0: The first element arr[0] = 5 is already sorted, so no need to shift. The array remains:
[5, 3, 8, 4, 2]
Iteration 2 (i = 1):
i = 1: Now, we compare arr[1] = 3 with arr[0] = 5.

j = 1: Compare arr[0] (5) and arr[1] (3). Since 5 > 3, we swap them.
Array after swap: [3, 5, 8, 4, 2]
j-- becomes 0, so we stop here.
After this iteration, the first two elements [3, 5] are sorted.

Iteration 3 (i = 2):
i = 2: Now we look at arr[2] = 8. We compare it with the sorted portion [3, 5].

j = 2: Compare arr[1] (5) and arr[2] (8). Since 5 <= 8, no swap is needed.
After this iteration, the first three elements [3, 5, 8] are sorted.

Iteration 4 (i = 3):
i = 3: Now we look at arr[3] = 4. We compare it with the sorted portion [3, 5, 8].

j = 3: Compare arr[2] (8) and arr[3] (4). Since 8 > 4, swap them.

Array after swap: [3, 5, 4, 8, 2]
j-- becomes 2.

j = 2: Compare arr[1] (5) and arr[2] (4). Since 5 > 4, swap them.

Array after swap: [3, 4, 5, 8, 2]
j-- becomes 1.

j = 1: Compare arr[0] (3) and arr[1] (4). Since 3 <= 4, no swap is needed.

After this iteration, the first four elements [3, 4, 5, 8] are sorted.

Iteration 5 (i = 4):
i = 4: Now we look at arr[4] = 2. We compare it with the sorted portion [3, 4, 5, 8].

j = 4: Compare arr[3] (8) and arr[4] (2). Since 8 > 2, swap them.

Array after swap: [3, 4, 5, 2, 8]
j-- becomes 3.

j = 3: Compare arr[2] (5) and arr[3] (2). Since 5 > 2, swap them.

Array after swap: [3, 4, 2, 5, 8]
j-- becomes 2.

j = 2: Compare arr[1] (4) and arr[2] (2). Since 4 > 2, swap them.

Array after swap: [3, 2, 4, 5, 8]
j-- becomes 1.

j = 1: Compare arr[0] (3) and arr[1] (2). Since 3 > 2, swap them.

Array after swap: [2, 3, 4, 5, 8]
j-- becomes 0, so we stop here.

At the end of this iteration, the entire array is sorted.

Final sorted array:
The sorted array is [2, 3, 4, 5, 8].
 */