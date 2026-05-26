package Arrays.Array1D;

import java.util.Scanner;

public class Demo1 {
    static void main() {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int n=arr.length;

        //taking input
        for(int i=0;i<=n-1;i++){
            System.out.println("Enter the value for index-"+i +" ");
            arr[i]=sc.nextInt();
        }
        System.out.println("printing the array elements");

        //printing the array
        for(int val:arr){
            System.out.print(val +" ");
        }


    }
}
