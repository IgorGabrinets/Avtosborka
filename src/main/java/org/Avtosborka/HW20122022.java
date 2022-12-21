//level2:
//Создайте массив размером 100 символов, заполните все ячейки согласно такому правилу:
//1 ячейка - 111, 2ая - 222, 3ая - 333,.... 11ая - 111, 12ая - 222, 13ая - 333. Найдите сумму значений всех ячеек

package org.Avtosborka;

import java.util.Arrays;

public class HW20122022 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i = 0; i <= 99; i += 10) {
            if (mas[0] == 111) ;
            mas[i] = 111;
            mas[i + 1] = 111 * 2;
            mas[i + 2] = 111 * 3;
            mas[i + 3] = 111 * 4;
            mas[i + 4] = 111 * 5;
            mas[i + 5] = 111 * 6;
            mas[i + 6] = 111 * 7;
            mas[i + 7] = 111 * 8;
            mas[i + 8] = 111 * 9;
            mas[i + 9] = 111 * 10;


            System.out.println(mas[i]);
            System.out.println(mas[i + 1]);
            System.out.println(mas[i + 2]);
            System.out.println(mas[i + 3]);
            System.out.println(mas[i + 4]);
            System.out.println(mas[i + 5]);
            System.out.println(mas[i + 6]);
            System.out.println(mas[i + 7]);
            System.out.println(mas[i + 8]);
            System.out.println(mas[i + 9]);
        }
        int s = Arrays.stream(mas).sum();
        System.out.println("the sum of all elements = " + s);
    }
}
