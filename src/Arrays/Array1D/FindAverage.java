package Arrays.Array1D;

public class FindAverage {

    static double findAverage(int[] arr){
        int sum=0;

        for(int element:arr){
            sum+=element;
        }

      return (sum/arr.length);


    }
    static void main() {
        int[] arr={2,4,3,3};
        double average=findAverage(arr);
        System.out.println(average);

    }
}
