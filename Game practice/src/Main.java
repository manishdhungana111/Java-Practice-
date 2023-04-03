import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Take input from user
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter S,P,R of your choice: ");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User value:" +userMove);
        //Generate automatic move by computer
        char[] maxMove = {'S','P','R'};
        Random random = new Random();
        int num=random.nextInt(3);
        System.out.println("computer value:");
        char computer = maxMove[num];
        System.out.println(computer);
        if(userMove==computer){
            System.out.println("Draw");
        }
        else if (userMove==)
    }
}