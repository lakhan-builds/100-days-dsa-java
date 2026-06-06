package Arrays.Array1D;

import javax.swing.*;
import java.util.HashMap;

public class FindFirstRepeatingElement {
    //ye mene solve kiya tha bhaiya ne brute force bol diya 😂
    static int firstRepeatingElement(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return arr[j];
                }

            }
        }

        return 0;
    }

    static int firstRepeatingElement2(int[] arr){
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int n:arr){
            freq.put(n,freq.getOrDefault(n,0)+1);

        }

        for(int i:arr){
            if(freq.get(i)>1){
                return i;
            }

        }
        return -1;

        // muje stating me dono time complexity same lgi me bhul gya plus krna hota h
    }

    static void main() {
        int[] arr={1,2,3,4,5,6,1,3,5};
        System.out.println(firstRepeatingElement(arr));
        System.out.println(firstRepeatingElement2(arr));
    }
}
