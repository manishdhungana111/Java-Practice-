import javax.swing.*;

public class Main3 {
    //public static void main(String[] args)
    {
        // Create the frame and set its properties
        JFrame frame = new JFrame("Swing Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400      );
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        // Create the text box and label
        JTextField textBox = new JTextField(20);
        JLabel label = new JLabel("Enter some text:");

        // Create the button and add an action listener

        JButton button = new JButton("Click me!");
        button.addActionListener(e -> {
            String text = textBox.getText();
            JOptionPane.showMessageDialog(frame, "You entered: " + text);
        });

        // Add the components to the frame
        frame.add(label);
        frame.add(textBox);
        frame.add(button);

        // Display the frame
        frame.setVisible(true);
    }
}
