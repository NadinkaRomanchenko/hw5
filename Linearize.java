package com.itacademy.hw5;

/**
 * 4. Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */

public class Linearize {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        print2(array);
        linearize(array);
        int[] res2 = linearize(array);
        print(res2);
    }

    public static void print2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] linearize(int[][] array) {
        int res[] = new int[(array.length) * (array[1].length)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                res[i * array.length + j] = array[i][j];
            }
        }
        return res;
    }

    public static void print(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}