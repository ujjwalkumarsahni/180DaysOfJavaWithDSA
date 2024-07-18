public class switchCase {
    public static void main(String args[]){
        int num = 20;
        switch(num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new AssertionError();
        }
    }
}
