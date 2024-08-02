import  java.util.ArrayList;


public class ArrayList{
    public static void main(String args[]){
        ArrayList<Integer>  l1 = new ArrayList<>();
        l1.add(2);
        l1.add(5);
        l1.add(4);
        System.out.println(l1.get(0));

        System.out.println(l1);

        for(int i = 0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("Hello World");
        l1.remove(1);
        System.out.println(l1);
    }
}

