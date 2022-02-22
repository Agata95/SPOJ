package com.spoj.easy.PrimeNumbers;

/* PRIME NUMBERS
Sprawdź, które spośród danych liczb są liczbami pierwszymi

  Input:
  n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]

  Output:
  Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (numbers[i] == 1) {
                System.out.println("NIE");
            } else {
                for (int j = 2; j < numbers[i]; j++) {
                    if (numbers[i] % j == 0) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("NIE");
                } else {
                    System.out.println("TAK");
                }
            }
        }
    }
}
