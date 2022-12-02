package com.com.practise.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class StringAnagram {
    public static boolean checkStringAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
    public static boolean isAnagramCounting(String string1, String string2) {
        int CHARACTER_RANGE= 256;
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAnagramCounting("care", "race"));
    }
}
