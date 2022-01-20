package com.company;

public class Main {
    public static void main(String[] args) {
	    System.out.println(isPalindromeString("abctcba"));
    }
    public static boolean isPalindromeString(String input){
        boolean isPolin=true;
       if (!input.isEmpty()){
           if (input.length()%2==0){
               for (int i = 1; i < input.length()/2; i++) {
                    char var1 = input.charAt((input.length())/2-i);
                    char var2 = input.charAt((input.length())/2+i-1);
                    if (var2!=var1)
                        isPolin=isPolin&false;
               }
           }
           if (input.length()%2!=0){
               for (int i = 1; i <= input.length()/2; i++) {
                   int ch=(int)(
                           (input.length())/2-i);
                   char var1 = input.charAt(ch);
                   char var2 = input.charAt((input.length())/2+i);
                   if ((var1!=var2))
                       isPolin=isPolin&false;
               }
           }
       }

       return isPolin;
    }

}
