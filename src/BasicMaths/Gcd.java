package BasicMaths;

public class Gcd {
    static void main() {
        int a=12;
        int b=18;
        System.out.println(getGCD(12,18));
    }

    static int getGCD(int a, int b){
        while(b!=0){
            int temp=b;
             b=a%b;
             a=temp;

        }
        int ans=a;
        return ans;
    }


}
