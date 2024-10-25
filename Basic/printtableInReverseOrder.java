public class printtableInReverseOrder {
    static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                System.out.print(multiplier*n+ " ");
                multiplier--;
            }
       System.out.println();
	 }
    public static void main(String args[]){
        int n = 2;
        printTable(n);
    }
}
