package Arrays.Array2D;

public class DiagonalSum {
    static void main() {
        int[][] arr={
                {1},
                {5,6},
                {9,10,11},
                {13,14,15,16}
        };
        int[][] arr2={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        DiagonalSum d=new DiagonalSum();
        d.diagonalSum(arr);
        d.diagonalSum(arr2);

    }
    public void diagonalSum(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                    break;
                }
            }
        }
        System.out.println("Diagonal sum is:-" + sum);
    }

}
