package Strings;

public class PrintStringChar {
    static void main() {
        String s1="lakhan sharma";
        printString(s1);
    }

    //print string character
    public static void printString(String s){

        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }


    }
}
