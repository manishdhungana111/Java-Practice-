import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Main {
  //  public static void main(String[] args)
    {
//        Creating frame
        JFrame frame = new JFrame("Hello!!");
//        frame.setTitle("Hii");
        frame.setResizable(false);  //Used for disabling resize button and resize feature.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits the whole program by  clicking on the x button.

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocation(500, 300);
        frame.setSize(500, 500);
        JTextField text = new JTextField("Enter two number: ");
        int num1, num2, sum;
        Scanner scanner;

        scanner = new Scanner(System.in);

        // Take two integer input from user and
        // store it in variable num1 and num2
        JTextField text2 = new JTextField("Enter First Number");
        num1 = scanner.nextInt();

        JTextField text3 = new JTextField("Enter Second Number");
        num2 = scanner.nextInt();

        // Add two numbers using + operator
        sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
        frame.setLayout(null);
        frame.setVisible(true);
        text.setBounds(50,50,300,30);
        frame.add(text);

        frame.setSize(500,500);
        JButton Add = new JButton("ADD");
        Add.setBounds(100, 100, 200, 50);
        frame.add(Add);
        JButton Sub = new JButton("SUBTRACT");
        Sub.setBounds(100, 200, 200, 50);
        frame.add(Sub);
        JButton btn = new JButton("Result");
        btn.setBounds(100, 300, 200, 50);
        frame.add(btn);
       // btn.setBackground(Color.WHITE);
        //frame.getContentPane().setBackground(Color.RED);
    }
}