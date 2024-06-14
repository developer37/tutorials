package com.baeldung.array;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayInitializer {

    static int[] initializeArrayInLoop() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }
        return array;
    }

    static int[][] initializeMultiDimensionalArrayInLoop() {
        int[][] array = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = j + 1;
            }
        }

        return array;
    }

    static String[] initializeArrayAtTimeOfDeclarationMethod1() {
        String[] array = new String[] { "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda" };
        return array;
    }

    static int[] initializeArrayAtTimeOfDeclarationMethod2() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        return array;
    }

    static int[] initializeArrayAtTimeOfDeclarationMethod3() {
        int[] array = { 1, 2, 3, 4, 5 };
        return array;
    }

    static long[] initializeArrayUsingArraysFill() {
        long[] array = new long[5];
        Arrays.fill(array, 30);
        return array;
    }

    static int[] initializeArrayRangeUsingArraysFill() {
        int[] array = new int[5];
        Arrays.fill(array, 0, 3, -50);
        return array;
    }

    static int[] initializeArrayUsingArraysCopy() {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] copy = Arrays.copyOf(array, 5);
        return copy;
    }

    static int[] initializeLargerArrayUsingArraysCopy() {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] copy = Arrays.copyOf(array, 6);
        return copy;
    }

    static int[] initializeArrayUsingArraysSetAll() {
        int[] array = new int[20];

        Arrays.setAll(array, p -> p > 9 ? 0 : p);
        return array;
    }

    static char[] initializeArrayUsingArraysUtilClone() {
        char[] array = new char[] { 'a', 'b', 'c' };
        return ArrayUtils.clone(array);
    }

    static int[] initializeArrayUsingArraysStream() {
        int[] array = new int[5];
        Arrays.setAll(array, i -> i + 1);
        return array;
    }

    static int[] initializeArrayWithDefaultValues() {
        return new int[5];
    }

    static double[] initializeArrayOfDoubleTypeWithDefaultValues() {
        return new double[5];
    }

    static String[] initializeArrayOfStringTypeWithDefaultValues() {
        return new String[5];
    }

    static boolean[] initializeArrayOfBooleanTypeWithDefaultValues() {
        return new boolean[5];
    }

    static int[][] initializeTwoDimensionalArrayWithDefaultValues() {
        return new int[2][5];
    }

    static int[] initializeArrayUsingIntStream() {
        int[] values = IntStream.of(1, 2, 3, 4, 5)
            .toArray();
        return values;
    }

    static double[] initializeArrayOfDoubleTypeUsingStreamApi() {
        return Arrays.stream(new double[] { 1.1, 2.2, 3.3, 4.4, 5.5 })
            .toArray();
    }

    static int[][][] initializeThreeDimensionalArrayWithDefaultValue() {
        return new int[2][3][4];
    }

    static int[][] initializeTwoDimensionalArrayUsingStream() {
        int[][] matrix = new int[3][4];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = IntStream.of(i * 4, i * 4 + 1, i * 4 + 2, i * 4 + 3)
                .toArray();
        }
        return matrix;
    }

}
