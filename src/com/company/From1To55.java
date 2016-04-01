package com.company;

/**
 * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class From1To55 {
    public static void main(String[] args) {
        int rezult = -1;
        for (int i = 0; i < 55; i++) {
            System.out.println(rezult += 2);
        }
    }
}
