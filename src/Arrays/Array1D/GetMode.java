package Arrays.Array1D;

import java.util.HashMap;
import java.util.Map;

public class GetMode {
    static int getMode(int[] arr){
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

//        for(int i: freq.keySet()){
//            System.out.println(i +"->" + freq.get(i));
//        }
        int maxFreq=-1;
        int maxFreqWaliKey=-1;
        for(int key: freq.keySet()){
            int currentKey=key;
            int currentKeyKiFreq=freq.get(key);

            if(currentKeyKiFreq>maxFreq){
                maxFreqWaliKey=currentKey;
                maxFreq=currentKeyKiFreq;
            }
        }
        return maxFreqWaliKey;
    }

    static void main() {
        int[] arr={1,1,2,2,2,2,2,3,4,5,5,5};
        System.out.println(getMode(arr));

    }


}
