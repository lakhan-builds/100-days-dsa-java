package Arrays.Array2D;

public class Jagged2D {
    static void main() {
        // initialize rows only
        int arr[][] = new int[3][];
//allocate no of columns in each row manually
        arr[0] = new int[5];  // Row 0 has 5 columns
        arr[1] = new int[3]; //Row 1 has 3 columns
        arr[2] = new int[1]; // row 2 has 1 column
        System.out.println(arr[0].length);

        int[] sizes = {5, 6, 9};
        int[][] arr2 = new int[sizes.length][];
        for(int i = 0; i < sizes.length; i++) {
            arr2[i] = new int[sizes[i]];
        }
    }

}
