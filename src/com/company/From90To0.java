package com.company;

/**
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class From90To0 {
    public static void main(String[] args) {
        int rezult = 90;
        while (rezult >= 0) {
            System.out.println(rezult);
            rezult -= 5;
        }
    }
}
