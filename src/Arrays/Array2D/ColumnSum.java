package Arrays.Array2D;

public class ColumnSum {
    static void main() {
        int[][] arr={
                {1},
                {5,6},
                {9,10,11},
                {13,14,15,16,}
        };
//        columnsum(arr);
        System.out.println("\n");
        columnsum2(arr);
    }


    //Column sum

    public static void columnsum(int arr[][]){
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr2[j]+=arr[i][j];
            }
        }
        for(int i=0;i< arr2.length;i++){
            System.out.println("sum of column - " + (i+1) + " is " + arr2[i]);
        }

    }

    public static void columnsum2(int matrix[][]){

        for (int j = 0; j < matrix[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + j + " sum = " + sum);
        }

    }
}

