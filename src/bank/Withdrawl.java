package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public  class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JTextField textField;
    Withdrawl(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel L3 = new JLabel(i3);
        L3.setBounds(0,0,1550,830);
        add(L3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRWAL IS 10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,700,35);
        L3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        L3.add(label2);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        L3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        L3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        L3.add(b2);


        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
         setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "' ");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }

                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values ('" + pin + "'  , '" + date + "' ,'withdrawl' , '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + "  Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);

                }

            } catch (Exception E) {

            }
        }else if(e.getSource()==b2){
            setVisible(false);
            new main_Class(pin);
        }
}
    public static void main(String args[]){
    new Withdrawl("");
    }
}
