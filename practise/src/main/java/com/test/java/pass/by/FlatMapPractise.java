package com.test.java.pass.by;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractise {

   static void checkFlatMap() {
        List<String> list = Arrays.asList("hello, how are you", "how are you doing?",
                "How have yo been", "how do you do");
        // create a temporary collection for our words
        List<String> words = list.stream().flatMap(elem -> Stream.of(elem.split(" ,")))
                .collect(Collectors.toList());
        System.out.println(words);
       System.out.println(words.size());

       // the cast to double is only needed to prevent Jva from using
       // Integer Division

       double avgLength = ((double) words.stream().map(String::length)
               .reduce(0,(x, y) -> x + y));
       System.out.println(avgLength);

       List<String> customers = Arrays.asList("aruna","vijay", "shreyan", "shresta");
       System.out.println(customers.stream().count());
   }

   static void verifyTerminalOperations() {

   }
    public static void main(String[] args) {
        checkFlatMap();
    }
}
