package org.Avtosborka;


import java.util.Scanner;

public class HW18122022_1 {
        public static void main(String[] args) {
            System.out.println("Put in two quantities:");
            Scanner input = new Scanner(System.in);
            double firstQuantity = input.nextDouble();
            double secondQuantity = input.nextDouble();
            System.out.println("Multiplication result:");
            System.out.println(firstQuantity * secondQuantity);
            System.out.println("Division result:");
            System.out.println(firstQuantity / secondQuantity);
            System.out.println("Addition result:");
            System.out.println(firstQuantity + secondQuantity);
            System.out.println("Subtraction result:");
            System.out.println(firstQuantity - secondQuantity);

        }
    }

