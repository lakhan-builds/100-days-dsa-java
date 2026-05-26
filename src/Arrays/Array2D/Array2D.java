package Arrays.Array2D;

public class Array2D {
    static void main() {
        //Declaration
        int[][] arr;
        //allocation
        arr=new int[3][4];
        //initialization
        int[][] brr={
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };
        int n= brr.length;
        int m=brr[0].length;

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }


        int[][] crr={
                {1,2},
                {3,4,5,6},
                {5,6,5},
                {7}
        };
        int n1= brr.length;

        for(int i=0;i<=n1-1;i++){
            // jagged array ke case me column length ese niklti h

            int m1=crr[i].length;
            for(int j=0;j<=m1-1;j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }




        /// this is how we have perfrom traversal into the 2-D array
        for(int i=0;i<brr.length-1;i++){
            for(int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
