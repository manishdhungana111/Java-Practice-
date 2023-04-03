import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class PhonebookGUI extends JFrame implements ActionListener {
     JTextField name, phone,city;
     DefaultTableModel tableModel;
     JTable Table;

    JButton insert = new JButton("Insert");

    JButton reset = new JButton("Reset");


    public PhonebookGUI() {
        setTitle("phonebook1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);



        JLabel nameLabel = new JLabel("Name:");
        name = new JTextField(20);
        JLabel cityLabel = new JLabel("City:");
        city = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone:");
        phone = new JTextField(20);


        insert.addActionListener(this);
        reset.addActionListener(this);


        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("City");
        tableModel.addColumn("Phone");
        Table = new JTable(tableModel);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(3, 3));
        inputPanel.add(nameLabel);
        inputPanel.add(name);
        inputPanel.add(cityLabel);
        inputPanel.add(city);
        inputPanel.add(phoneLabel);
        inputPanel.add(phone);
        contentPane.add(inputPanel, BorderLayout.NORTH);
        JPanel outputPanel =new JPanel(new GridLayout(2,2));
        outputPanel.add(insert);
        outputPanel.add(reset);
        contentPane.add(outputPanel,BorderLayout.CENTER);
        contentPane.add(new JScrollPane(Table), BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insert) {
            String name1 = name.getText();
            String phone1 = phone.getText();
            String city1 = city.getText();
            tableModel.addRow(new String[]{name1, city1, phone1});
            name.setText("");
            city.setText("");
            phone.setText("");
        }
        if (e.getSource() == reset){
            name.setText("");
            city.setText("");
            phone.setText("");
        }
    }


}
