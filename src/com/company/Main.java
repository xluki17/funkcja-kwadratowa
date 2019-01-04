package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Trojmian trojmian=new Trojmian();

        trojmian.czytaj_dane();
        trojmian.przetworz_dane();
        trojmian.wyswietl_wynik();

    }
}
