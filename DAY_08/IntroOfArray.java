class Array{
    void damoArray(){
        int[] age = new int[3];
        age[0] = 10;
        age[1] = 18;
        age[2] = 21;

        // System.out.println(age.length);
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
    }

    void multiDim(){
        // int[][] arr = new int[3][3];
        int[][] arr2 = {{23,45,77},{54,77,2},{87,54,24}};

        // System.out.println(arr2.length);
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        
    }
}
public class IntroOfArray{

    public static void main(String args[]){
        Array obj = new Array();
        obj.damoArray();
        obj.multiDim();
    }
}