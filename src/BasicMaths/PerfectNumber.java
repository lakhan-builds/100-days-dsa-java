package BasicMaths;

public class PerfectNumber {
    static void main() {
        System.out.println(perfectNumber(496));
    }

    static boolean perfectNumber(int num){
        int sum=1;
        int number=num;
        int i=2;
        while (i*i<=num){
            if(num%i==0){
                int firstFactor=i;
                int secondFactor=num/i;

                sum=sum+firstFactor+secondFactor;
            }
            i++;
        }
        if(sum==number){
            return  true;

        }
        return false;
    }
}
