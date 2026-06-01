package BasicMaths;

public class ReverseNumber {
    static void main() {
        System.out.println(reverseNumber(1234));

    }

    public static int reverseNumber(int num){
        int revNum=0;
        while(num!=0){
            int digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
       return revNum;

    }
}
