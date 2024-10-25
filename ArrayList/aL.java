import java.util.*;
public class aL {
    public static class Arraylist{
        int[] arr = new int[5];

        int idx = 0;
        int size = 0;

        public void add(int ele){
            if(size==arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr,brr.length);
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
    }
    public static void main(String args[]){
        Arraylist arr = new Arraylist();

        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        System.out.println(arr.size);
        arr.add(4);
        System.out.println(arr.size);
    }
}
