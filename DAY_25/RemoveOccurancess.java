public class RemoveOccurancess{
    static String RemoveA(String str,int idx){
        if(idx == str.length()){
            return "";
        }
        String smallAns = RemoveA(str,idx+1);
        char curr = str.charAt(idx);
        if(curr != 'a'){
            return curr + smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String args[]){
        String str = "abacdx";

        System.out.println(RemoveA(str,0));
    }
}
