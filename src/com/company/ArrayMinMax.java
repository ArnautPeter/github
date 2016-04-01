package com.company;

import java.util.Scanner;

import static com.company.First5Elem.createArray;

/**
 * 6. Найти минимальный и максимальный элемент массива
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива");
        int arraySize = scanner.nextInt();
        int[] array = createArray(arraySize);
        System.out.println("Минимальный элемент в массиве: " + findMin(array));
        System.out.println("Максимальный элемент в массиве: " + findMax(array));
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
}
