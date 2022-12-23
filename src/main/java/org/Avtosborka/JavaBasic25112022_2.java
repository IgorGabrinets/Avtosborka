//Создайте массив размером 100 символов,
// заполните все ячейки согласно такому правилу:
// 1 ячейка - 111, 2ая - 222, 3ая - 333,….  11ая - 111, 12ая - 222, 13ая - 333.
// Найдите сумму значений всех ячеек

        package org.Avtosborka;

import java.util.Arrays;

public class JavaBasic25112022_2 {
    public static void main(String[] args) {
        int k = 111;
        int[] mas = new int[100];
        for (int i = 0; i < 99; i += 10) {
            for (int j = 0; j < 10; j++) {
                mas[i + j] = k * (j + 1);
                System.out.println(mas[i + j]);
            }
        }
        int s = Arrays.stream(mas).sum();
        System.out.println("the sum of all elements = " + s);
        System.out.println("проверка " + mas[0]);
        System.out.println("проверка " + mas[55]);
    }
}