import java.util.Scanner;
public class InputOutput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Please Enter Full Name :");
        System.out.print(name);
        sc.close();
    }
}