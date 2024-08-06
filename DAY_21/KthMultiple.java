public class KthMultiple{

    static void printMultiple(int n,int k){
        // base case
        if(k==1){
            System.out.println(n);
            return;
        }
        // Recursive work
        printMultiple(n,k-1);
        // self work
        System.out.println(n*k);

    }
    public static void main(String args[]){
        int n = 5;
        int k = 4;
        printMultiple(n,k);
    }
}


