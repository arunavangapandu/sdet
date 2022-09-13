package com.practise.designpatterns;

public class SingletonPatternTest {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.logMessgaeStart();
        logger.logMessageStop();
    }
}
