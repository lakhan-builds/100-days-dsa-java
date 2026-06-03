package Arrays.Array1D;

import java.util.HashMap;

public class HighestAndLowestFreq {

    //function to get lowest and highest frequency

    static int[] getHighestLowestFreqElement(int[] arr){
        HashMap<Integer,Integer> freq=new HashMap<>();

        //freqCount
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        //highest frequency
        int highestFreq=Integer.MIN_VALUE;
        int highestKaNum=-1;

        for(int key:freq.keySet()){
             int currentKey=key;
             int currentFreq=freq.get(key);
             if(currentFreq>highestFreq){
                 highestFreq=currentFreq;
                 highestKaNum=currentKey;
             }
        }

        int lowestFreq=Integer.MAX_VALUE;
        int lowestKaNum=-1;

        for (int key: freq.keySet()){
            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq<lowestFreq){
                lowestFreq=currentFreq;
                lowestKaNum =currentKey;
            }
        }
        int[] ans={lowestKaNum,highestKaNum};
        return ans;
    }

    static void main() {
        int[] arr={1,2,2,3,3,3,4,4,5,5,5,5,5,5};
        int[] ans=getHighestLowestFreqElement(arr);

        System.out.println("lowest frequency : "+ans[0]);
        System.out.println("Highest frequency : "+ans[1]);
    }

}
