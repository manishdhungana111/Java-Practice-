package Fibiccano;

import java.util.Scanner;

public class Fibonacci {
    public void fibo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }

    }
}
