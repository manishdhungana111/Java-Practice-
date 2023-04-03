import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();

    JTextField t3 = new JTextField();


    JButton add = new JButton("ADD");
    JButton sub = new JButton("Sub");
    JButton mul = new JButton("Multiply");
    JButton div = new JButton("Division");
    void render(){

        t1.setBounds(90,70,200,30);
        t2.setBounds(90,110,200,30);
        t3.setBounds(350,110,150,30);

        t1.getText();
        t2.getText();


        add.setBounds(90,150,200,30);
        sub.setBounds(90,180,200,30);
        mul.setBounds(90,210,200,30);
        div.setBounds(90,240,200,30);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);


        frame.setSize(600,600);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(t2);
        frame.add(t1);
        frame.add(t3);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add)
        {
            String d,d1;
            d = t1.getText();
            d1 = t2.getText();
            int d2 = Integer.parseInt(d) + Integer.parseInt(d1);
            t3.setText(String.valueOf(d2));
        }
        if (e.getSource() == sub)
        {
            String d,d1;
            d = t1.getText();
            d1 = t2.getText();
            int d2 = Integer.parseInt(d) - Integer.parseInt(d1);
            t3.setText(String.valueOf(d2));
        }
        if (e.getSource() == mul)
        {
            String d,d1;
            d = t1.getText();
            d1 = t2.getText();
            int d2 = Integer.parseInt(d) * Integer.parseInt(d1);
            t3.setText(String.valueOf(d2));
        }
        if (e.getSource() == div)
        {
            String d,d1;
            d = t1.getText();
            d1 = t2.getText();
            Float d2 = Float.parseFloat(d) / Float.parseFloat(d1);
            t3.setText(String.valueOf(d2));
        }

    }
}

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalcGUI implements ActionListener {
        JFrame frame = new JFrame("Calculator");
        JTextField txt = new JTextField();
        JTextField txt1 = new JTextField();
        JButton btn = new JButton("ADD");
        JLabel label = new JLabel();
        public void render(){
        frame.setSize(700,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        public void txtField(){
        txt.setBounds(50,50,300,30);
        //System.out.println(data);
        txt1.setBounds(50,110,300,30);
        btn.setBounds(50,160,200,50);
        btn.setBackground(Color.white);
        btn.addActionListener(this);
        label.setBounds(50,220,300,100);
        label.setText("SUM");
        frame.add(txt);
        frame.add(txt1);
        frame.add(btn);
        frame.add(label);
        }

        */