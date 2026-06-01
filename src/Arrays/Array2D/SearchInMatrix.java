package Arrays.Array2D;

public class SearchInMatrix {
    static void main() {
        int[][] arr1={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
    }

    public boolean searchInMatrix(int[][] arr,int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return  false;
    }

}
