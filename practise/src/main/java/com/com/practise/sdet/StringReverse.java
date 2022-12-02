package com.com.practise.sdet;

public class StringReverse {

   public static String stringReverse(String str) {
       StringBuilder replace = new StringBuilder();
       if(str.length() == 0)
           return null;
        for(int i = str.length()-1; i >= 0; i--) {
            replace.append(str.charAt(i));
        }

       return replace.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringReverse("aruna"));
    }
}
