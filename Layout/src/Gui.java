import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame frame = new JFrame();
    JButton btn = new JButton("Click Me");
    JPanel p1 = new JPanel();
    JPanel c1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
   public void render(){

       frame.setLayout(new BorderLayout());
       frame.add(p1, BorderLayout.NORTH);
       frame.add(p2, BorderLayout.EAST);
       frame.add(p3, BorderLayout.WEST);
       frame.add(p4, BorderLayout.SOUTH);
       frame.add(c1,BorderLayout.CENTER);

       p1.setBackground(Color.RED);
       p2.setBackground(Color.cyan);
       p3.setBackground(Color.cyan);
       p4.setBackground(Color.cyan);
       c1.setBackground(Color.PINK);

       p1.setLayout(new FlowLayout(FlowLayout.LEFT));

       p1.add(btn);
       p1.add(btn);
       p1.add(btn);

      p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
       p2.add(new JButton("Click ME"));
       p2.add(new JButton("Click ME"));
       p2.add(new JButton("Click ME"));

       c1.setLayout(new GridLayout(3,3));
       c1.add(new JButton("Click ME"));
       c1.add(new JButton("Click ME"));
       c1.add(new JButton("Click ME"));

       /*

       p4.add(new JButton("Click ME"));
       p4.add(new JButton("Click ME"));
       p4.add(new JButton("Click ME"));
       c1.add(new JButton("Click ME"));
       c1.add(new JButton("Click ME"));
       c1.add(new JButton("Click ME"));*/



        frame.setSize(400,400);
        frame.setTitle("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}
