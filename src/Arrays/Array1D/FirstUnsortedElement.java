package Arrays.Array1D;

public class FirstUnsortedElement {
    static int firstUnsortedElement(int arr[]){
        int previous=0;
        for(int i=0;i < arr.length;i++){
            if(i==0){
                previous=arr[i];
                continue;
            }
            if(arr[i]<previous){
                return arr[i];
            }

            previous=arr[i];

        }
        return 0;
    }

    static int firstUnsortedElement2(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return arr[i+1];
            }

        }
        return -1;
    }

    static void main() {
        int arr[]={1,2,3,4,10,5,6,7,1};
        System.out.println(firstUnsortedElement(arr));
        System.out.println(firstUnsortedElement2(arr));
    }
}
