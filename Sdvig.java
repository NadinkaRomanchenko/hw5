package com.itacademy.hw5;

/**
 * 1. Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */

public class Sdvig {

    public static void main(String[] args) {
        int[] values = {4, 5, 6, 7, 8};
        print(values);
        sdvig(values);
        print(values);
    }

    public static void print(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void sdvig(int[] values) {
        int save = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = save;
    }
}
