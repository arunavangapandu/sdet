package com.test.java.pass.by;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*    Predicate<T> --- > filter()
      Function<T, R> --- > map() ---> transforming oa collection from one type to another form by applying a
     given function on eache element of the collection.
     original source remains the same --> side effect free
     Consumer<T> ---forEach() --> returns void
* */

public class TestReduce {

    public static void main(String[]args){
        System.out.println(testReduce(Arrays.asList(2,3,5,7,11,13,19, 23)));
        List<String> cats = Arrays.asList("tiger", "caat", "Tiger", "Tiger", "leopard");
        System.out.println(cats);
        test(cats);
        System.out.println(cats);
        checkStringImmutability();
        checkStringBuilder();
        checkCollection();
    }

    static double testReduce(List<Integer> nums) {
        // avg(), min(), max(), count(), sum()
        double sumOfPrimes = ((double)nums.stream().reduce(0, (x,y) -> {
            System.out.println("x is " + x);
            return x + y;}));

        return sumOfPrimes;
    }

    static void test(List<String> cats) {
        String tigers = cats.stream().filter(e -> e.equalsIgnoreCase("tiger")).collect(Collectors.joining(","));
        System.out.println(tigers);

        String s = "tiger";
        Predicate<String> p = e -> e.equalsIgnoreCase(s);
        Predicate<String> combined = p.or(e -> e.equalsIgnoreCase("leopard"));
        String pride = cats.stream().filter(combined).collect(Collectors.joining(","));
        System.out.println(pride);


    List<Integer> namesLength = cats.stream().map(e -> e.length()).collect(Collectors.toList());
    System.out.println(namesLength);

    cats = Arrays.asList("dog", "monkey", "cat");
        System.out.println(cats);

    cats.stream().forEach(System.out::println);
    cats.stream().forEach(e -> System.out.println(e));

    }

    static void testString() {
        String pet = "cat"; // string literal
        char[] pullingTeeth = {'c', 'a','t'};

        String petCat = new String(pullingTeeth);
        System.out.println("cat".length());

        // toString() is defined on Object, and is designed to convert any object from object to string


    }

    // String concatenation ---> strings are immutable
    static void checkStringImmutability() {
        String s1 = "AB";
        String s2 = "CD";

        String s3 = s1;
        System.out.println(s1 == s3);

        s3 = s1 + s2;
        System.out.println(s1 == s3);
        System.out.println(s1);
        System.out.println(s3);

    }

    static void checkStringBuilder() {
       /* String petAnimal = "dog";
        StringBuilder sb = new StringBuilder(petAnimal);
        sb.append("is faithful animal");
        System.out.println(sb.toString());
*/
        String pet = "cat";
        String boat = pet + "faithful";
        System.out.println(boat);
    }

    static void checkCollection() {
        Collection<String> set = new HashSet<>();
        List<String> numbersList = Arrays.asList("one", "two", "three");

        List<String> numberList = new ArrayList<>(numbersList);
        set.addAll(numbersList);
        System.out.println(set);
        set.add("five");
        System.out.println(set);
        Collection<String> copy = new HashSet<>(numbersList);
        System.out.println(copy);
        copy.remove("three");
        System.out.println(copy);
        copy.removeAll(numbersList);
        System.out.println(copy);
        System.out.println(copy.isEmpty());
        copy.size();
        copy.addAll(numbersList);
        System.out.println(copy);
        System.out.println(copy.contains("three"));
        System.out.println(copy.containsAll(numbersList));
        copy.remove("two");
        System.out.println(copy.containsAll(numbersList));
        System.out.println(copy);
        copy.add("six");
        Object[] arrElements = copy.toArray();
        String[] strings = copy.toArray(new String[copy.size()]);
        strings = copy.toArray(set.toArray(new String[0]));

        System.out.println("copy is " + copy);
        System.out.println(numbersList);
        System.out.println(copy.retainAll(numbersList));
        System.out.println(copy);
        System.out.println(numberList.retainAll(numbersList));
        System.out.println(numberList);


    }
}

