import javax.swing.*;
import java.awt.*;


public class Main2 {
    //public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello World");
        JButton btn = new JButton("Result");
        JTextField text = new JTextField();


        frame.setLayout(null);
        frame.setVisible(true);
        btn.setBounds(100,100,200,50);
        frame.add(btn);
        btn.setBackground(Color.WHITE);
//        btn.setForeground(Color.WHITE);
        text.setBounds(50,50,300,30);
        frame.add(text);
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.yellow);
//        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
