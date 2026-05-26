package Arrays.Array1D;

public class ReverseArray {
    static void main() {
        int arr[]={1,2,3,4,5,6};
        printArr(arr);
        reverseArray(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr){
      for(int val:arr){
          System.out.print(val+" ");
      }
        System.out.println();
    }


    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int cont=arr[start];
            arr[start]=arr[end];
            arr[end]=cont;
            start++;
            end--;
        }


        }
    }

