package BasicMaths;

public class CheckPrime {
    static void main() {
//        System.out.println(checkPrime(8));
        System.out.println(checkPrime2(2));
        System.out.println(checkPrime2(3));
        System.out.println(checkPrime2(4));
        System.out.println(checkPrime2(15));
        System.out.println(checkPrime2(17));
        System.out.println(checkPrime2(21));
        System.out.println(checkPrime2(23));
    }
    public static boolean checkPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }

            i++;
        }
        return true;
    }

    public static boolean checkPrime2(int num){
        int i=2;
        while(i*i<=num){
            if(num%i==0){
                return false;
            }

            i++;
        }
        return true;
    }
}
