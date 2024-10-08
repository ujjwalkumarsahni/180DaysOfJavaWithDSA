public class FirstNaturalUsingRecursion{
    
    static void PrintNaturalNo(int n){// 1 2 3 ... n-1 n
        // base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        // Recursive work that is subproblem
        PrintNaturalNo(n-1);// 1 2 3 ... n-1

        // self work
        System.out.print(n+" ");
    }

    public static void main(String args[]) {
        int n = 10;
        PrintNaturalNo(n);
    }
}
