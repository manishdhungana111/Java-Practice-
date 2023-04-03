import java.util.Scanner;
public class Prime {

        public void primee() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a Number:");
            int num;
            int count = 0;
            num = scan.nextInt();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Entered Number is prime number");
            } else if (count == 1) {
                System.out.println("Entered Number is Prime number");
            } else {
                System.out.println("Entered Number is Composite Number");
            }
        }
    }
