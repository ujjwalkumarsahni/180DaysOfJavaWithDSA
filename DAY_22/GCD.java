public class GCD {
    static int GcdRecursion(int a, int b) {
        if(b==0){
            return a;
        }
        return GcdRecursion(b , a%b);

    }
    static int gcd(int a, int b) {
        while (a % b != 0) {
            int rev = a % b;
            a = b;
            b = rev;
        }
        return b;

    } 
        public static void main(String args[]){
        int x = 15;
        int y = 20; 
        System.out.println(gcd(x,y));

        System.out.println(GcdRecursion(x,y));

        
    }
}


