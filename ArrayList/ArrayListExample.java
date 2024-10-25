import java.util.*;
public class ArrayListExample{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(); 
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.set(1,200);
        int len = arr.size();
        System.out.println(len);
        System.out.println(arr);
    }
}