package com.company;

import java.util.Scanner;

/**
 * 5. Найти сумму первых n элементов массива
 */
public class First5Elem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива (больше 5)");
        int arraySize = scanner.nextInt();
        int[] array = createArray(arraySize);
        System.out.println("Сумма первых 5ти элементов массива: " + calculateFirst5(array));
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введи " + (i + 1) + " элемент массива");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int calculateFirst5(int[] array) {
        int rezult = 0;
        for (int i = 0; i < 5; i++) {
            rezult += array[i];
        }
        return rezult;
    }
}
