package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1;
    String pin;
  BalanceEnquiry(String pin){
      this.pin = pin;

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
      Image i2 = i1.getImage().getScaledInstance(1500,830,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel L3 = new JLabel(i3);
      L3.setBounds(0,0,1550,830);
      add(L3);

      JLabel label1 = new JLabel("YOUR CURRENT BALANCE IS Rs.");
      label1.setForeground(Color.WHITE);
      label1.setFont(new Font("System",Font.BOLD,16));
      label1.setBounds(430,180,700,35);
      L3.add(label1);

       label2 = new JLabel();
      label2.setForeground(Color.WHITE);
      label2.setFont(new Font("System",Font.BOLD,16));
      label2.setBounds(430,220,400,35);
      L3.add(label2);

      b1 = new JButton("Back");
      b1.setBounds(700,406,150,35);
      b1.setBackground(new Color(65,125,128));
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      L3.add(b1);

      int balance = 0;
      try{
          Con c = new Con();
          ResultSet resultSet = c.statement.executeQuery("select * from bank  where pin = '"+pin+"' ");
          while(resultSet.next()){
              if (resultSet.getString("type").equals("Deposit")) {
                  balance += Integer.parseInt(resultSet.getString("amount"));
              } else {
                  balance -= Integer.parseInt(resultSet.getString("amount"));
              }
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      label2.setText(""+balance);


      setLayout(null);
      setSize(1550,1000);
      setLocation(0,0);
      // setUndecorated(true);
      setVisible(true);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
    setVisible(false);
    new main_Class(pin);
    }

    public static void main(String args[]){
    new BalanceEnquiry("");
    }
}
