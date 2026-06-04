package Arrays.Array1D;

public class FindTheMissingElement {
    static int findMissing(int[] arr){
        //Given an array arr containing n distinct element taken from range [0-n] find the missing
        int num=0;
        int temp= arr.length;
        for(int i=0;i<temp;i++){
            num=num^(arr[i]^i);
        }

        return num^temp;
    }

    static void main() {
        int[] arr={5,6,0,2,4,1,8,7};
        System.out.println(findMissing(arr));

        //approach-1 by using XOR operator
        //approach-2 sum[0-->n]== array ka sum
    }
}
