//Level2
//Вклад в банке составляет x рублей.
//Ежегодно он увеличивается на p процентов, после чего дробная часть копеек отбрасывается.
//Каждый год сумма вклада становится больше.
//Определите, сколько будет на счету через k лет.
//До начала программирования решите эту задачу на бумаге - возьмите p=10, k=2, x = 1000
//Обе задачи решаются через for
//Second level:

package org.Avtosborka;

import java.util.Scanner;

public class HW_18122022 {
    public static void main(String[] args) {
        double p;
        double k;
        double x;

        System.out.println("Enter the deposit amount");
        Scanner deposit = new Scanner(System.in);
        x = deposit.nextDouble();

        if (true) {
            System.out.println("Enter the interest rate");
            Scanner rate = new Scanner(System.in);
            p = rate.nextDouble() / 100;
        }
        if (true) {
            System.out.println("Deposit period in years");
            Scanner period = new Scanner(System.in);
            k = period.nextDouble();
        }
        for (int i = 0; i < k; i++) {
            x = (x * p) + x;
        }
        System.out.println("The total will be  " + x);
    }
}

