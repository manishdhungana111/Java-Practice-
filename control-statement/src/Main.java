import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

            switch(age){
                case 40:
                    System.out.println("I Will Buy a new House");
                    break;
                case 60:
                    System.out.println("I Will Retire");
                    break;
                default:
                    System.out.println("I Will Buy a new Car");
            }
        }
    }
