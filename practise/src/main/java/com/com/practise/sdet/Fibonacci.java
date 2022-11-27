package com.com.practise.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.com.practise.sdet.Fibonacci.findFibSubset;

public class Fibonacci {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,2,3,5,8,13};
        int[] fibSeq = findFibSubset(arr, arr.length);
        findMagicalSet(arr, fibSeq);
    }
    static void findMagicalSet(int[] arr, int[] fib) {
        if (Arrays.equals(arr, fib)) {
            System.out.println("Magical subset");
        } else {
            System.out.println("Not Magical subset");
        }
    }
     /*static void findFibSubset(int[] arr, int n) {
        // find largest element in array
        // generate fibonaci upto largest number
        // loop through and check each number for fibonacci
        int max = largest(arr);
        List<Integer> fibSequence = fib(max);
         List<Integer> original = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(Integer i = 0; i < arr.length; i++) {
            if(fibSequence.contains(arr[i]))
                System.out.print(arr[i]+ " ");
        }
    }*/

    static int[] findFibSubset(int[] arr, int n) {
        // find largest element in array
        // generate fibonaci upto largest number
        // loop through and check each number for fibonacci
        int max = largest(arr);
        List<Integer> fibSequence = fib(max);
        List<Integer> original = Arrays.stream(arr).boxed().collect(Collectors.toList());
       // List<Integer> result = new ArrayList<>();
        int[] result = new int[n];

        for(int i = 0; i < arr.length; i++) {
            if(fibSequence.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                result[i] = arr[i];
            }
        }
        return result;
    }

    static int largest(int[] arr)
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    static List<Integer> fib(int n)
    {
        Integer a = 0, b = 1, c;
        List<Integer> fibSeq = new ArrayList<>();

     //   int[] result = new int[n];
        if (n == 0)
            return fibSeq;
        fibSeq.add(a);
        fibSeq.add(b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            fibSeq.add(c);
            //result[i] = c;
            a = b;
            b = c;
        }
        return fibSeq;
    }

}
