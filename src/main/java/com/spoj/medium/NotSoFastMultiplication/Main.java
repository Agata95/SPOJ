package com.spoj.medium.NotSoFastMultiplication;

/* NotSoFastMultiplication
Pomnóż dwie podane liczby.

   Wejście:
    n [liczba par liczb, które trzeba pomnożyć ≤ 1000]
    l1 l2 [liczby do pomnożenia, długości liczb ograniczone do 10000 cyfr]

   Wyjście:
    Wynik mnożenia podanych liczb.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l1, l2;
        for (int i = 0; i < n; i++) {
            l1 = scanner.nextInt();
            l2 = scanner.nextInt();
            System.out.println(l1 * l2);
        }
    }
}
