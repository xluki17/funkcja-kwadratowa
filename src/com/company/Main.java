package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner odczyt = new Scanner(System.in);
        System.out.print("podaj a=");
        a = odczyt.nextDouble();
        if (a == 0) {
            System.out.println("TO NIE JEST FUNKCJA KWADRATOWA!!!");
        } else {
            System.out.print("podaj b=");
            b = odczyt.nextDouble();
            System.out.print("podaj c=");
            c = odczyt.nextDouble();

            double delta, x1, x2;
            delta = b * b - 4 * a * c;
            System.out.println(delta);

            if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("x1=" + x1);
                x2 = (-b + Math.sqrt(delta)) / 2 * a;
                System.out.println("x2=" + x2);
            } else if (delta == 0) {
                x1 = (-b) / 2 * a;
                System.out.print("x=" + x1);
            } else {
                System.out.println("Nie ma rozwiązania!");
            }

        }
    }
}
