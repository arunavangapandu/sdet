package com.practise.designpatterns;

public class SingletonLogger {
    // Eager initialization ----> makes application consumes more memory
    // private static SingletonLogger instance = new SingletonLogger();

     private  static SingletonLogger instance;

     private SingletonLogger() {}

    public static synchronized SingletonLogger getInstance() {
         if(instance == null) {
             instance = new SingletonLogger();
         }
         return instance;
     }

     public  void logMessgaeStart() {
         System.out.println("start message is logged");
     }

     public void logMessageStop() {
         System.out.println("stop message");
     }
}
