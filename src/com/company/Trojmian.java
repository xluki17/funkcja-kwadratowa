package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trojmian {

    double a, b, c, delta, x1, x2;

    public void czytaj_dane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pierwiastki rownania kwadratowego.");
        System.out.println("Podaj a: ");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("podano nieprawidłową wartość!");
            System.exit(1);
        } else {
            System.out.println("Podaj b: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj c: ");
            c = Double.parseDouble(br.readLine());
        }
    }

    public void przetworz_dane() // deklaracja i definicja metody przetworz_dane()
    {
        delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / 2 * a;
            //    System.out.println("x1=" + x1);
            x2 = (-b + Math.sqrt(delta)) / 2 * a;
            //   System.out.println("x2=" + x2);
        } else if (delta == 0) {
            x1 = (-b) / 2 * a;
            //   System.out.print("x=" + x1);
        } else {
            // System.out.println("Nie ma rozwiązania!");
        }
    }

    public void wyswietl_wynik() // deklaracja i opis metody wyswietl_wynik()
    {
        System.out.print("Pierwiastki równania kwadratowego o parametrach a= " + a + "; b= " + b + "; c= " + c);
        System.out.print(" wynosi ");
        if (delta > 0) {
            System.out.print("x1= ");
            System.out.printf("%2.2f", x1);
            System.out.print("x2= ");
            System.out.printf("%2.2f", x2);
        } else if (delta==0) {
            System.out.print("x1= ");
            System.out.printf("%2.2f", x1);
        } else {
            System.out.println("Nie ma rozwiązania!");
        }

    }

}
