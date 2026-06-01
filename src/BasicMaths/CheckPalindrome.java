package BasicMaths;

public class CheckPalindrome {
    static void main() {
        System.out.println(checkPalindrome(1221));
    }

   static boolean checkPalindrome(int num){
        int num2=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        if(num2==reverse){
            return true;
        }

        return false;
    }
}
