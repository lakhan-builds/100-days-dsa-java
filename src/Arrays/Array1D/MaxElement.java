package Arrays.Array1D;

public class MaxElement {
    static void main() {

        int arr[]={1,2,4,56,55,4,3,2};
        int max=arr[0];

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println(max);
    }
}
