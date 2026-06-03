package Arrays.Array1D;

public class MultiplyBy10 {
    static void multiplyBy10(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]*=10;
        }

    }

    static void main() {
        int[] arr={1,2,3,4,5};
        PrintArray.printArray(arr);
        multiplyBy10(arr);
        PrintArray.printArray(arr);
    }
}
