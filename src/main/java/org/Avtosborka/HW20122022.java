//level2:
//Создайте массив размером 100 символов, заполните все ячейки согласно такому правилу:
//1 ячейка - 111, 2ая - 222, 3ая - 333,.... 11ая - 111, 12ая - 222, 13ая - 333. Найдите сумму значений всех ячеек

package org.Avtosborka;

import java.util.Arrays;


public class HW20122022 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i = 0; i <= 9; i += 10) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 1; k <= 10; k++) {
                    mas[i + j] = 111 * k;
                    System.out.println(mas[i + j]);
                }
            }
        }
        int sum = Arrays.stream(mas).sum();
        System.out.println("the sum of all elements = " + sum);
    }
}
