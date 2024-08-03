public class PrintNToOneUdingRecursion {

    static void PrintDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintDecreasing(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        PrintDecreasing(n);
    }
}


