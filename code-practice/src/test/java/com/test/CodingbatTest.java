package com.test;

import com.learn.functionalprogramming.LambdaExpression;
import com.practice.sessions.WarmUpExcercises;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CodingbatTest {

    WarmUpExcercises exercises;
    LambdaExpression lambdaexp;

    @Before
    public void init(){
        exercises = new WarmUpExcercises();
        lambdaexp = new LambdaExpression();
    }
    @Test
    public void verify_given_String_contains_echars() {
        assertTrue(exercises.verifyString("Hello"));

       // assertTrue(exercises.verifyString("he"));

    }

    @Test
    public void verify_not_string() {
        assertEquals("notcandy", exercises.notString("candy"));
    }

    @Test
    public void verify_string_bits() {
        assertEquals("Hlo", exercises.stringBits("Hello"));
    }
    @Test
    public void verify_lambda_expression() {
        assertEquals("hi aruna",
                LambdaExpression.lambdaExp("aruna"));
    }

    @Test
    public void verify_function_interface() {
      /*  assertEquals(Arrays.asList("JAVA8", "STREAMS"),
                lambdaexp.allToUpperCase.apply(Arrays.asList("java8", "streams")));
      */  assertEquals(Arrays.asList("JAVA8", "STREAMS"),
                lambdaexp.convertAllToUpperCase(Arrays.asList("java8", "streams")));

    }

    @Test
    public void verify_function_lambda() {
        Integer expected = 1004;
        Integer actual = lambdaexp.stringToInteger.apply("1004");
        assertEquals(expected, actual );
    }
}
