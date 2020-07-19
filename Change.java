package com.itacademy.hw5;

/**
 * 2. Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */

public class Change {

    public static void main(String[] args) {
        int[] values = {3, 5, 7, 3, 8, 7, 5, 4};
        print(values);
        change(values);
        print(values);
    }

    public static void print(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void change(int[] values) {
        for (int i = 1; i < values.length; i++) {
            for (int j = 0; j < i; j++) {
                if (values[i] == values[j]) {
                    values[i] = 0;
                }
            }
        }
    }
}
