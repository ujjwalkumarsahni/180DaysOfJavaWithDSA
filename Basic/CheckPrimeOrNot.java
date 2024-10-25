public class CheckPrimeOrNot {
    static void isPrime(int n){
        int count = 0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }

    public static void main(String args[]){
        int n = 23;
        isPrime(n);
    }
}
