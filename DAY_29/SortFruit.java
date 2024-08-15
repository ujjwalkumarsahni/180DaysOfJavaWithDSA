public class SortFruit{
    static void sortFruit(String[] str){
        int n = str.length;
        for(int i =0;i<n-1;i++){
            int min_idx = i;
            for(int j =i+1;j<n;j++){
                if(str[j].compareTo(str[min_idx]) < 0){
                    min_idx = j;
                }
            }
            String temp = str[i];
            str[i] = str[min_idx];
            str[min_idx] = temp;
        }
    }
    public static void main(String args[]){
        String[] str = {"kivi","apple","papaya","mango"};
        sortFruit(str);

        for(String val : str){
            System.out.print(val+" ");
        }
    }
}