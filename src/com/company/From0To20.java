package com.company;

/**
 * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class From0To20 {

    public static void main(String[] args) {
        int rezult = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println(rezult * 2);
            rezult *= 2;
        }

    }
}
