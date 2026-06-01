package BasicMaths;

public class ArmStrongNumber {
    static void main() {
        System.out.println(armStrongnumber(153));
    }

    public static boolean armStrongnumber(int num){
        int sum=0;
        int number=num;
        while(num!=0){
            int digit=num%10;
            sum+=digit*digit*digit;
            num=num/10;
        }
        if(sum==number){
            return true;
        }
        return false;

    }
}
