package Arrays.Array1D;

public class SumOfPositiveNegative {

    static void sumOfPositiveNegative(int arr[]){

        int posSum=0;
        int negSum=0;
        for(int element:arr){
            if(element>0){
                posSum+=element;
            }
            else{
                negSum+=element;
            }
        }
        System.out.println("sum of positive is : "+ posSum);
        System.out.println("sum of negative is : " + negSum);
    }

    static void main() {
        int[] arr={-1,-2,-3,4,5,6};
        sumOfPositiveNegative(arr);
    }
}
