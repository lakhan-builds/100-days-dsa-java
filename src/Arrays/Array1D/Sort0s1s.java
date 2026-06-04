package Arrays.Array1D;

import java.util.Collection;

public class Sort0s1s {
    static void sortZerosOnes(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i<j){
            //agr 1 hota h to i aage nhi jyega jb tk swap ni ho jata
            if(arr[i]==1){
                //check for the zero
                if(arr[j]==0){
                    //swap logic
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                }
                j--;
            }
            else{
                //i!=1  then i++
                i++;
            }
        }
    }

    static void main() {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1};
        PrintArray.printArray(arr);
        sortZerosOnes(arr);
        PrintArray.printArray(arr);



        // approach 1. count 0's and 1's then put them  O(n)
        // approach 2. collection ki sort method use kr lege O(nlogn)
        //approach 3. jo mene use kri h
    }
}
