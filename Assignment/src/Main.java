import Fibiccano.Fibonacci;
import Multiplication.Multiplication;
import Currency.Currency;
import Permutation.Permutation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        int choice;
        while (true) {
            System.out.println("\nEnter your choice from 1-4");
            System.out.println("1=Multiplication table\n 2=Currency converter\n " +
                    "3=Permutation\n 4=Fibonacci Series ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Multiplication mul = new Multiplication();
                    mul.multiply();
                    break;
                case 2:
                    Currency cur = new Currency();
                    cur.curr();
                    break;
                case 3:
                    Permutation per = new Permutation();
                    per.permu();
                    break;
                case 4:
                    Fibonacci fib = new Fibonacci();
                    fib.fibo();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("\nY/N");

            ch = scan.next().charAt(0);
            if(ch == 'Y' || ch =='y'){
                continue;
            }
            else {
                break;
            }
        }
    }
}