package BasicMaths;

public class BitWiseOperator {
    static void main() {
        System.out.println(5&4);

        //checking even odd
        int number=2;
        if((number&1)==0) {
            System.out.println("number is EVen");
        }
        else {
            System.out.println("number is odd");
        }

        //multiply by 2
        int n=number<<1;

        //divide by 2
        n=number>>1;

        //check power of 2
        number=8;

        System.out.println("val "+ (4&1));

        //swap





    }
}
