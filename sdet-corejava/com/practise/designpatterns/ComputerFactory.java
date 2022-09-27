//package com.practise.designpatterns;
//
//import com.practise.designpatterns.creationalpatterns.AbstractFactory;
//
//// Adv: Hides the internal logic of creating objects
//// Enables the programmer to add new different objects of the same type
//// disadv: complexity of the pattern tend to be high
//// can't be refactored
//public class ComputerFactory extends AbstractFactory {
//    public Computer getComputer(String computer) {
//        if ("Laptop".equalsIgnoreCase(computer)) {
//            return new Laptop();
//        } else if ("Phone".equalsIgnoreCase(computer)) {
//            return new Phone();
//        } else if ("SmartTv".equalsIgnoreCase(computer)) {
//            return new SmartTv();
//        }
//        return null;
//    }
//
//
//    public static void main(String[] args) {
//        ComputerFactory test = new ComputerFactory();
//        test.getComputer("laptop").compute();
//        System.out.println(test.getComputer("vodafone"));
//    }
//
//}
