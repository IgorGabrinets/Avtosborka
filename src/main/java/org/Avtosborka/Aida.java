package org.Avtosborka;

import java.util.Scanner;

public class Aida {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age please");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name, please");
            String name = scanner.nextLine();
            System.out.printf("Hello, %s, u are %d years old", name, age);

        }
}
