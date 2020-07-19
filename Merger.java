package com.itacademy.hw5;

/**
 * 3. Заданы 2 массива целых чисел произвольной длины. 
 * Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */

public class Merger {

    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7};
        int[] values3 = new int[values1.length + values2.length];
        print(values1);
        print(values2);
        values3 = marger(values1, values2);
        print(values3);
    }

    public static void print(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static int[] marger(int[] values1, int[] values2) {
        int[] values3 = new int[values1.length + values2.length];
        int min = 0;
        if (values1.length >= values2.length) {
            min = values2.length;
        }
        for (int i = 0; i < min; i++) {
            values3[2 * i] = values1[i];
            if (i < values2.length) {
                values3[2 * i + 1] = values2[i];
            }
        }
        for (int i = 0; i < (values1.length - values2.length); i++) {
            values3[2 * min + i] = values1[i + min];
        }
        return values3;
    }
}
