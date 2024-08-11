public class FrogJump{
    static int Best(int[] h,int n, int idx){

        if(idx == n-1) return 0;
        int opt1  = Math.abs(h[idx] - h[idx+1]) + Best(h,n,idx+1);
        if(idx == n-2) return opt1;
        int opt2  = Math.abs(h[idx] - h[idx+2]) + Best(h,n,idx+2);

        return Math.min(opt1,opt2);
    }
    public static void main(String args[]){
        int[] h = {10,20,30,40};

        System.out.println(Best(h,h.length,0));
    }
}
