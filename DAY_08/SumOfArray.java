class SumArray{
    void SumAllElement(){
        int[] arr = {1,2,3,4,5};
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans = ans + arr[i];
        } 
        System.out.println(ans);
    }
}
public class SumOfArray {
    public static void main(String args[]){
        SumArray obj =  new SumArray();
        obj.SumAllElement();
    }
}
