class Traversing{

    void Traverse(){
        int[] age = new int[5];

        age[0] = 10;
        age[1] = 21;
        age[2] = 18;
        age[3] = 34;
        age[4] = 13;

        // using for loop
        for(int i = 0;i<age.length;i++){
            // System.out.println(age[i]);
        }

        // using for each loop
        for(int i : age){
            // System.out.println(i);
        }

        // using while loop
        int i = 0;
        while(i<age.length){
            System.out.println(age[i]);
            i++;
        }
    }
    void multiDim(){
        int[][] arr = new int[3][3];
        int[][] arr2 = {{23,45,77},{54,77,25},{87,54,24}};

        // System.out.println(arr2.length);
        // System.out.println(arr2[0][0]);
        // System.out.println(arr2[0][1]);
        // System.out.println(arr2[0][2]);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
}


public class TraversingInArray {
    public static void main(String args[]){
        Traversing obj = new Traversing();
        obj.Traverse();
        obj.multiDim();
    }
}
