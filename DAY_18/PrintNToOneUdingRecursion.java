public class PrintNToOneUdingRecursion {

    static void PrintDecreasing(int n){
        // base case
        if(n==1){
            System.out.println(1);
            return;
        }
        // self work
        System.out.println(n);

        // Recursive work that is subproblem
        PrintDecreasing(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        PrintDecreasing(n);
    }
}



