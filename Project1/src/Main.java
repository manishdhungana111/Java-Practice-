import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);
            char ch;
            int choice;
            while (true) {
                System.out.println("\nEnter your choice from 1-4");
                System.out.println("1=Fantasy\n 2=Historical\n " +
                        "3=Sci-Fic\n 4=Drama ");
                Book_catalog cat = new Book_catalog();
                choice = scan.nextInt();
                switch (choice){
                    case 1:
                        cat.Fantasy();
                    break;
                    case 2:
                        cat.Historical();
                        break;
                    case 3:
                        cat.SciFic();
                        break;
                    case 4:
                        cat.Drama();
                        break;
                    default:
                        System.out.println("Invalid choice");
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
}