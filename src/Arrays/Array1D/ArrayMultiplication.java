package Arrays.Array1D;

public class ArrayMultiplication {

    static void main() {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        int mul=1;
        for(int i=0;i<=n-1;i++){
            mul*=arr[i];
        }
        System.out.println("the mul is-"+mul);
    }
    }

