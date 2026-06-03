package Arrays.Array1D;

public class ShiftBy1 {

    static void shiftElement(int[] arr){
        //step1: store the last element
        int n= arr.length-1;
        int temp=arr[n];
        //step2: shift all the values of array
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
        }
        //step3: temp ki value ko 0 index pr copy kr do
        arr[0]=temp;

    }
    //main function
    static void main() {
        int[] arr={1,2,3,4,5,6};
        PrintArray.printArray(arr);
        shiftElement(arr);
        PrintArray.printArray(arr);
    }
}
