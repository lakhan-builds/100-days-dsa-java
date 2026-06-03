package Arrays.Array1D;

public class PrintAlternate {
    static void printAlternate(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i]);
            System.out.print(" "+ arr[j] + " ");
            i++;
            j--;
        }
    }

    static void main() {
//        int[] arr={1,2,3,4};
        int[] arr={1,2,3,4,5};
        printAlternate(arr);
    }
}
