package Arrays.Array2D;

public class RowSum {
    static void main() {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        RowSum r1=new RowSum();
        r1.rowsum(arr);
    }

    //row sum function
    public void rowsum(int arr[][]){
        int sum;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum of row-" + i + "is :-" + sum);
        }
    }
}
