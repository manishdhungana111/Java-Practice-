/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class Gui extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JLabel l1 = new JLabel("Name:");
    JLabel l2 = new JLabel("City:");
    JLabel l3 = new JLabel("Phone:");
    JButton insert = new JButton("insert");
    JButton reset = new JButton("reset");
    DefaultTableModel tableModel;
    JTable table;


    void render(){
        t1.setBounds(150,80,200,50);
        t2.setBounds(150,130,200,50);
        t3.setBounds(150,180,200,50);
        l1.setBounds(100,80,200,50);
        l2.setBounds(100,130,200,50);
        l3.setBounds(100,180,200,50);
        insert.setBounds(150,250,100,50);
        insert.addActionListener(this);
        reset.setBounds(250,250,100,50);
        reset.addActionListener(this);

        tableModel = new DefaultTableModel();

        tableModel.addColumn("Name");
        tableModel.addColumn("City");
        tableModel.addColumn("Phone");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);


        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(insert);
        frame.add(reset);

       Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
       // contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.pack();



       /* Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(t1);
        inputPanel.add(t2);
        inputPanel.add(t3);
        inputPanel.add(l1);
        inputPanel.add(l2);
        inputPanel.add(l3);
        inputPanel.add(insert);
        inputPanel.add(reset);
        contentPane.add(new JScrollPane(phonebookTable));

        frame.setSize(600,600);
        frame.setTitle("phonebook1");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == insert){
        String name = t1.getText();
        String city = t2.getText();
        String phone =t3.getText();
        tableModel.addRow(new String[]{name, city , phone});
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    }
}
*/