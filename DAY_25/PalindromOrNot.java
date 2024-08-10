public class PalindromOrNot {
    static String Reverse(String str,int idx){
        if(idx==str.length()){
            return "";
        }

        String smallAns = Reverse(str, idx+1);

        return smallAns + str.charAt(idx);
    }
    public static void main(String args[]){
        String str = "dad";
        String ans = Reverse(str, 0);

        if(ans.equals(str)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
