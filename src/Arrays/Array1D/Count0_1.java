package Arrays.Array1D;

public class Count0_1 {

    static void count_0_1(int[] arr){
        int zeros=0;
        int ones=0;

        for (int element:arr){
            if(element==0){
                zeros++;
            } else if (element==1) {
                ones++;

            }
        }
        System.out.println("zeros: "+zeros);
        System.out.println("ones: "+ones);
    }

    static void main() {
        int[] arr={1,1,1,0};
        count_0_1(arr);
    }
}
