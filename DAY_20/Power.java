public class Power{
    static int power(int p, int base){
        // base case
        if(base == 0){
            return 1;
        }
        // recursive work
        int smallAns = power(p,base-1);
        
        // self work
        return smallAns * p;

    }
    public static void main(String args[]){
        int  p =5;
        int base = 4;
        System.out.println(power(p,base));
    }
}

