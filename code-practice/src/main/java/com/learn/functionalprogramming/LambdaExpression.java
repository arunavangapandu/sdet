package com.learn.functionalprogramming;
// Streams would be helpful to manipulate the collections
// with stream Api , can write declarative, parallelizable, composable(
  //  greater flxibility code) -- refer 105
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static String lambdaExp(String str) {
        Wish wish = s -> "hi " + s;
        return wish.greet(str);
    }

    //public Function<List<String>, List<String>> allToUpperCase =  words -> words.stream()
    //        .map(String::toUpperCase).collect(Collectors.toList());

    public List<String> convertAllToUpperCase(List<String> words) {
        return words.stream().map(String::toUpperCase).collect(Collectors.toList());
    }


    // Method references
    public Function<String, Integer> stringToInteger = s -> Integer.parseInt(s);
    Predicate<List<String>> predicateTest = list -> list.isEmpty();
    List<String> inventory = Arrays.asList("green", "red");
    Predicate<String> p = s -> inventory.add(s);

    

}