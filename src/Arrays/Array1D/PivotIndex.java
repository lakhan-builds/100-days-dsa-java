package Arrays.Array1D;

public class PivotIndex {

    static int findPivotIndex(int[] arr){
        int n= arr.length;
        int i=1;
        int j= n-2;
        int[] leftSum=new int[arr.length];
        int[] rightSum=new int[arr.length];

        leftSum[0]=arr[0];
        rightSum[n-1]=arr[n-1];

        while (i <arr.length){
            leftSum[i]=leftSum[i-1]+arr[i];
            rightSum[j]=rightSum[j+1]+arr[j];
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            if(leftSum[k]==rightSum[k]){
                return k;
            }

        }
        return -1;
    }

    static void main() {
        int[] arr={1,7,3,6,5,6};
        System.out.println(findPivotIndex(arr));
    }

}
