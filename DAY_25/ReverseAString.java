public class ReverseAString {
    static String Reverse(String str,int idx){
        if(idx==str.length()){
            return "";
        }

        String smallAns = Reverse(str, idx+1);

        return smallAns + str.charAt(idx);
    }
    public static void main(String args[]){
        String str = "dcba";
        System.out.println(Reverse(str, 0));

    }
}
