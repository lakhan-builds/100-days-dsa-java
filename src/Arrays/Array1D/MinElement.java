package Arrays.Array1D;

public class MinElement {
    static void main() {

        int arr[]={1,2,4,56,55,4,3,2};
        int min=arr[0];

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println(min);
    }
}
