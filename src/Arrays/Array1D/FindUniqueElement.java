package Arrays.Array1D;

public class FindUniqueElement {
    //sare element 2 baar  h bss ek h jo ek baar  h
    static int findUnique(int[] arr){
        int temp=0;
        for (int n:arr){
            temp=temp^n;
        }
        return temp;
    }

    static void main() {
        int[] arr={2,3,4,5,2,3,5};
        System.out.println(findUnique(arr));
    }
}
