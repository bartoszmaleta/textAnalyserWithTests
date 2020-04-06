package com.company.secondSolutionWithTests;

import java.util.Arrays;
import java.util.Collections;

public class MainForExes {
    public static void main(String[] args) {
        fizzBuzz(20);
        int[] numbersArray = {1, 2, 4, 11, 12, 8};
        System.out.println(doubleResult(2, numbersArray));;

    }

    private static int doubleResult(int b, int[] numbers) {

        try {
            if (numbers.length == 0 || numbers == null) {

                return b;
            } else {
                Arrays.sort(numbers);
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == b) {
                        b *= 2;
                    }
                }
            }
        }
        catch(NullPointerException e)
        {
            return b;
        }



        return b;

    }

    private static void fizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if ((i > 0) && (i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println("Fizz");
            } else if ((i % 5 == 0) && (i % 3 != 0)) {
                System.out.println("Buzz");
            } else if ((i % 3 != 0) || (i % 5 != 0)) {
                System.out.println(i);
            }
        }

    }
}
