package com.practice.sessions;

// Return true if the given string contains between 1 and 3 'e' chars.
public class WarmUpExcercises {
   public boolean verifyString(String str) {
       String extractedString;
       if(str.length() >= 3) {
           extractedString = str.substring(1,4);
           if(extractedString.contains("e")) {
               return true;
           }
       }
        return  false ;
    }

    public String notString(String str) {
       if(str.length() <= 3)
            return "not"+str;
       if(str.substring(0,3).equals("not"))
           return str;
       else
           return "not"+str;
    }


    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

}
