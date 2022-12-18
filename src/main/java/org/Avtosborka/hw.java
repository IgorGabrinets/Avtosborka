package org.Avtosborka;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        System.out.println("enter a number of at least 2");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = a - 1;
        while (i >= 1) {
            i = i - 1;
            if (a % i == 0)
                break;
        }
        System.out.println("the greatest divisor of a number without a remainder is " + i);
    }
}
