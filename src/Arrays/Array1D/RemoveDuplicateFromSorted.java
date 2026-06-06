package Arrays.Array1D;

public class RemoveDuplicateFromSorted {

    //logic-1
    static int getDuplicateRemove(int[] arr){
        int count=0;
        int n=arr.length;
        for( int i = 0; i < n; i++) {
            if( i > 0 && arr[i]==arr[i-1]){
                count++;
            }
        }
        return count;
    }

    //logic-2

    static int getDuplicateRemove2(int[] arr){
        int i=0;
        int j=1;
        while(j< arr.length){
            //[j]--yaar i ky meri value tere equal h??

            if(arr[i]!=arr[j]){
                //[i]---nhi bhaii equal to nhi h .....
                //[j]----chal thik h tu meri jgha aa jaa or me jo value de rha hu insert kr de
                arr[++i]=arr[j];
                j++;
            }
            else{
                // [i]-- haa bhai equal h.....
                //[j]---thik h aage ja kr dekh or kuch bhi equal h ky
                j++;
            }
        }

        return i+1;
    }

    static void main() {
        int[] arr={1,2,2,2,2,3,3,4};
        System.out.println(getDuplicateRemove(arr));
        System.out.println(getDuplicateRemove2(arr));
    }
}
