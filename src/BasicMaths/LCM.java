package BasicMaths;

public class LCM {
    static void main() {
        System.out.println(getLCM(18,12));

    }

    public static int getLCM(int a,int b){
        int gcd=Gcd.getGCD(a,b);
        int product=a*b;
        int lcm=product/gcd;
        return lcm;
    }
}
