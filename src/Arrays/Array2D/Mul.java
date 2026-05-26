package Arrays.Array2D;

public class Mul {
    static void main() {
        int[][] crr={
                {1,2},
                {3,4,5,6},
                {5,6,5},
                {7}
        };
        int sum=0;
        int mul=1;

        for(int i=0;i<crr.length;i++){
            for(int j=0;j<crr[i].length;j++){
                mul*=crr[i][j];
                sum+=crr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(mul);
    }
    }


