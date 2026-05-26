package Strings;

public class CountLength {
    static void main() {
        String s="lakhan  sharma";
        int length=countLength(s);
        System.out.println(length);

    }

    public static int countLength(String s){
        char[] arr=s.toCharArray();
        int length=arr.length;
        return length;

    }
}
