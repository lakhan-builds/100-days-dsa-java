package Arrays.Array1D;

public class TwoSum {
    static void twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("i-"  + nums[i]);
                    System.out.println("j-"  + nums[j]);
                }
            }
        }

    }

    static void main() {
        int[] arr={2,1,3,5,4,6};
        twoSum(arr,10);
    }
}
