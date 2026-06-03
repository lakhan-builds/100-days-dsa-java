package Arrays.Array1D;

public class ShiftByKPosition {
   static void shiftByKPosition(int[] arr,int k){
       k=k%(arr.length);
        int[] arr2=new int[k];
        int n= arr.length-1;
        int i=n;

        //save the values
        for(int j=0;j<k;j++){
            arr2[j]=arr[n-j];
        }

        //shift
        while(i>=k){
            arr[i]=arr[i-k];
            i--;
        }

        //again put the saved value

        int x=k-1;
        for(int m=0;m<k;m++){
//            System.out.println(x);
            arr[m]=arr2[x--];

        }

    }

    static void main() {
        int[] arr={1,2,3,4,5,6,7};
        PrintArray.printArray(arr);
        shiftByKPosition(arr,8);
        PrintArray.printArray(arr);
    }
}
