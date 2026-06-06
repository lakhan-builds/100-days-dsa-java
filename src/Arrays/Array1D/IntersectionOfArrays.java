package Arrays.Array1D;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {

    static List<Integer> getIntersection(int[] arr1, int[] arr2){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        return list;
    }

    static void main() {
        int[] arr1={1,2,3,4,5,6,7,8};
        int[] arr2={1,4,6,7,2,3,3};
        System.out.println(getIntersection(arr1,arr2));
    }
}
