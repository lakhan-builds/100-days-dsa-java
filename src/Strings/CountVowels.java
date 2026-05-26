package Strings;

public class CountVowels {
    static void main() {
        String s="aeiouAEP";
        int count=countVowels(s);
        System.out.println(count);

    }

    public static int countVowels(String s){
        int count=0;
        char[] arr={'a','A','e','E','i','I','o','O','u','U'};
        for(int i=0;i<s.length();i++){
           for(int j=0;j<arr.length;j++)
           {
               if(s.charAt(i)==arr[j]){
                   count++;
               }
           }
        }

        return count;
    }
}
