public class BubbleSort {
    static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] >arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[])
    {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        bubbleSort(arr,n);

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}


/** 

Initial array: [5, 3, 8, 4, 2]
n = 5

Iteration 1 (i = 0):
We are comparing adjacent elements and swapping if the left element is larger.

j = 0: Compare arr[0] (5) and arr[1] (3). Since 5 > 3, swap them.
Array after swap: [3, 5, 8, 4, 2]
j = 1: Compare arr[1] (5) and arr[2] (8). Since 5 <= 8, no swap.
Array remains: [3, 5, 8, 4, 2]
j = 2: Compare arr[2] (8) and arr[3] (4). Since 8 > 4, swap them.
Array after swap: [3, 5, 4, 8, 2]
j = 3: Compare arr[3] (8) and arr[4] (2). Since 8 > 2, swap them.
Array after swap: [3, 5, 4, 2, 8]
At the end of this iteration, the largest element 8 has bubbled to its correct position (last index).

Iteration 2 (i = 1):
Now, we only consider the first four elements because the last one is sorted.

j = 0: Compare arr[0] (3) and arr[1] (5). Since 3 <= 5, no swap.
Array remains: [3, 5, 4, 2, 8]
j = 1: Compare arr[1] (5) and arr[2] (4). Since 5 > 4, swap them.
Array after swap: [3, 4, 5, 2, 8]
j = 2: Compare arr[2] (5) and arr[3] (2). Since 5 > 2, swap them.
Array after swap: [3, 4, 2, 5, 8]
At the end of this iteration, the second largest element 5 has bubbled to its correct position (second last index).

Iteration 3 (i = 2):
We now consider the first three elements because the last two are sorted.

j = 0: Compare arr[0] (3) and arr[1] (4). Since 3 <= 4, no swap.
Array remains: [3, 4, 2, 5, 8]
j = 1: Compare arr[1] (4) and arr[2] (2). Since 4 > 2, swap them.
Array after swap: [3, 2, 4, 5, 8]
At the end of this iteration, the third largest element 4 has bubbled to its correct position.

Iteration 4 (i = 3):
We now consider the first two elements because the last three are sorted.

j = 0: Compare arr[0] (3) and arr[1] (2). Since 3 > 2, swap them.
Array after swap: [2, 3, 4, 5, 8]
At the end of this iteration, the fourth largest element 3 has bubbled to its correct position.
**/