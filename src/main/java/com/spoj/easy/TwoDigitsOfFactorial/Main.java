package com.spoj.easy.TwoDigitsOfFactorial;

/* TWO DIGITS OF FACTORIAL
Napisz program, który:
wczyta ze standardowego wejścia nieujemną liczbę całkowitą n,
policzy cyfrę dziesiatek oraz cyfrę jedności w zapisie dziesiętnym liczby n!,
wypisze wynik na standardowe wyjście.
    Wejście:
    W pierwszej linii wejścia znajduje się jedna liczba całkowia D (1≤D≤30),
    oznaczjąca liczbę przypadków do rozważenia. Opis każdego przypadku składa
    się z jednej linii, w której znajduje się jedna nieujemna liczba
    całkowita n (0 ≤ n ≤ 1 000 000 000).

    Wyjście:
    Dla każdego przypadku z wejścia. Twój program powinien wypisać w osobnej
    linii dokładnie dwie cyfry (oddzielone pojedynczą spacją): cyfrę dziesiątek
    i cyfrę jedności liczby n! zapisanej w systemie dziesiętnym.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                long factory = 1;
                number = scanner.nextInt();
                for (int j = 1; j <= number; j++) {
                    factory = factory * j;
                }
                String new_factory = String.valueOf(factory);
                if (new_factory.length() >= 2) {
                    System.out.print(new_factory.charAt(new_factory.length() - 1));
                    System.out.print(' ');
                    System.out.print(new_factory.charAt(new_factory.length() - 2));
                    System.out.println();
                } else {
                    System.out.print("0"+ ' ');
                    System.out.print(new_factory.charAt(new_factory.length() - 1));
                    System.out.println();
                }
            }
        }
    }
}
