public class SumOfAllDivisers {
        static long sumOfDivisors(int n) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (n / i) * i;
            }
            return sum;
        }
        public static void main(String args[]){
            int n = 4;
            long ans = sumOfDivisors(n);
            System.out.println(ans);
        }
}
