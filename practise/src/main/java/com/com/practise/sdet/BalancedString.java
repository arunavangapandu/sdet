package com.com.practise.sdet;

public class BalancedString {
    public  static int checkBalanced(String str) {
        int balance = 0, answer = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'R')
                balance++ ;
            else
                balance-- ;
            if(balance == 0)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(checkBalanced("RLRRLLRLRL"));
    }

}
