public class FirstNaturalUsingRecursion{
    
    static void PrintNaturalNo(int n){// 1 2 3 ... n-1 n
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintNaturalNo(n-1);// 1 2 3 ... n-1
        System.out.print(n+" ");
    }

    public static void main(String args[]) {
        int n = 10;
        PrintNaturalNo(n);
    }
}
