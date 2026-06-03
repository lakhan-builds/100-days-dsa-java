package Arrays.Array1D;

public class ReverseArray {

    //reverse an array program
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //main function
    static void main() {
        int arr[]={1,2,3,4,5,6};
        PrintArray.printArray(arr);
        reverseArray(arr);
        PrintArray.printArray(arr);
    }
}


