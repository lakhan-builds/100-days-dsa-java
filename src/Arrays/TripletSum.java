package Arrays;

import Arrays.Array1D.PrintArray;

import java.util.*;

public class TripletSum {
    static List<List<Integer>> getSum(int[] arr, int target){
        Set<List<Integer>> ans=new HashSet<>();
        int n= arr.length;;
        for(int i=0;i<n-2;i++){
            for (int j = i+1; j <n; j++) {
                for (int k = j+1; k <n; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }

            }
        }
        return new ArrayList<>(ans);
    }

    static void main() {
        int[] arr={1,2,3,4,5,6,8,9,0};
        System.out.println(getSum(arr,16));
    }
}
