package Arrays.Array1D;

public class linearSearch {
    static void main() {
        int[] arr={3,4,6,7,8,9,10};
        boolean isTrue=linearSearch(arr,0);
        System.out.println(isTrue);
    }

    //function for linear search
    public  static boolean linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }

        }
        return false;
    }
}
