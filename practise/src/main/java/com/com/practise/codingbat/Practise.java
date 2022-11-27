package com.com.practise.codingbat;

public class Practise {
        public int makeChocolate(int small, int big, int goal) {

            if(goal >= 5){
                if(goal/5 >= big){
                    goal -= big * 5;
                }else{
                    goal = goal % 5;
                }
            }
            if(goal <= small) return goal;
            return -1;

        }

    public static void main(String[] args) {
        System.out.println(new Practise().makeChocolate(4, 1, 10));
    }

}
