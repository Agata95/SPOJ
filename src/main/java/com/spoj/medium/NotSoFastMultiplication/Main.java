package com.spoj.medium.NotSoFastMultiplication;

/*
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
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        multiplication(n, scanner);
        int[] l1 = new int[]{4, 123, 324, 0, 9999};
        int[] l2 = new int[]{2, 43, 342, 12, 12345};
        multiplicationWithExample(5, l1, l2);
    }

    private static void multiplicationWithExample(int n, int[] l1, int[] l2) {
        long result;
        for (int i = 0; i < n; i++) {
            result = l1[i] * l2[i];
            System.out.println(result);
        }

    }

    public static void multiplication(int n, Scanner scanner) {
        long result;

        for (int i = 0; i < n; i++) {
            int l1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            result = l1 * l2;
            System.out.println(result);
        }
    }


}
