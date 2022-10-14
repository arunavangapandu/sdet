package com.learn.enums;
// use enums to represent a  fixed set of constants
 enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

class EnumTest {
     Day day;

     public EnumTest(Day day) {
         this.day = day;
     }

     public void printDay() {
         switch(day) {
             case MONDAY:
                 System.out.println("Mondays are good");
                 break;
             case FRIDAY:
                 System.out.println("Fridays are lazy");
                 break;
             case SATURDAY: case SUNDAY:
                 System.out.println("Weekends are ok");
                 break;
             default:
             System.out.println("Midweek days are ok");
             break;
         }
     }
    public void  printDaysOfTheWeek() {
        for(Day day:Day.values())
            System.out.println("Days of the week are: " + day);
     }
    public static void main(String[] args) {
        EnumTest test = new EnumTest(Day.FRIDAY);
        test.printDay();
        test.printDaysOfTheWeek();
    }
}