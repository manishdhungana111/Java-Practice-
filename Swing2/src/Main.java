import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Practice GUI");

        JTextField textBox = new JTextField();
        JLabel label = new JLabel("Enter your UserName");
        frame.add (label);
        label.setBounds(100,50,200,50);
        frame.add(textBox);
        textBox.setBounds(100,100,200,50);

        JPasswordField textBox1 = new JPasswordField();
        JLabel label2 = new JLabel("Enter your Password ");
        JButton btn2 = new JButton();
        frame.add(btn2);
        btn2.setBounds(300,200,50,25);

        frame.add(label2);
        label2.setBounds(100,150,200,50);
        frame.add(textBox1);
        textBox1.setBounds(100,200,200,50);

        String[] fruits ={"Apple","Orange","Grapes","WaterMelon"};
        JComboBox comboBox = new JComboBox(fruits);
        frame.add(comboBox);
        comboBox.setBounds(100,260,200,50);
        comboBox.setBackground(Color.RED);
        comboBox.setForeground(Color.WHITE);

        JButton btn = new JButton("Login");
        frame.add(btn);
        btn.setBounds(100,320,200,50);

        JPasswordField password = new JPasswordField();
        frame.add(password);




        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
    }
}