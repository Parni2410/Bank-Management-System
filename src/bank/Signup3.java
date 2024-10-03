package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.ExportException;
import java.util.Random;
public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton  s,c;
    String formno;


    Signup3( String formno) {
     this.formno = formno;
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
     Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(150, 5, 100, 100);
     add(image);

     JLabel L1 = new JLabel("Page 3:");
     L1.setFont(new Font("Raleway", Font.BOLD, 22));
     L1.setBounds(280, 40, 400, 40);
     add(L1);

     JLabel L2 = new JLabel("Account Details");
     L2.setFont(new Font("Raleway", Font.BOLD, 22));
     L2.setBounds(280, 70, 400, 40);
     add(L2);

     JLabel L3 = new JLabel("Account Type");
     L3.setFont(new Font("Raleway", Font.BOLD, 18));
     L3.setBounds(100, 140, 200, 30);
     add(L3);

     r1 = new JRadioButton("Saving Account");
     r1.setFont(new Font("Raleway", Font.BOLD, 16));
     r1.setBackground(new Color(215, 252, 252));
     r1.setBounds(100, 180, 150, 30);
     add(r1);

     r2 = new JRadioButton("Fixed Deposit");
     r2.setFont(new Font("Raleway", Font.BOLD, 16));
     r2.setBackground(new Color(215, 252, 252));
     r2.setBounds(350, 180, 300, 30);
     add(r2);

     r3 = new JRadioButton("Current Account");
     r3.setFont(new Font("Raleway", Font.BOLD, 16));
     r3.setBackground(new Color(215, 252, 252));
     r3.setBounds(100, 220, 250, 30);
     add(r3);

     r4 = new JRadioButton("Reccuring Deposit Account");
     r4.setFont(new Font("Raleway", Font.BOLD, 16));
     r4.setBackground(new Color(215, 252, 252));
     r4.setBounds(350, 220, 250, 30);
     add(r4);

     ButtonGroup buttonGroup = new ButtonGroup();
     buttonGroup.add(r1);
     buttonGroup.add(r2);
     buttonGroup.add(r3);
     buttonGroup.add(r4);

     JLabel L4 = new JLabel("Card Number:");
     L4.setFont(new Font("Raleway", Font.BOLD, 18));
     L4.setBounds(100, 300, 200, 30);
     add(L4);

     JLabel L5 = new JLabel("(Your 16-dogit Card Number)");
     L5.setFont(new Font("Raleway", Font.BOLD, 12));
     L5.setBounds(100, 330, 200, 20);
     add(L5);

     JLabel L6 = new JLabel("XXXX-XXXX-XXXX-4841");
     L6.setFont(new Font("Raleway", Font.BOLD, 18));
     L6.setBounds(330, 300, 250, 30);
     add(L6);

     JLabel L7 = new JLabel("(It would appear on atm card/cheque Book and Statement)");
     L7.setFont(new Font("Raleway", Font.BOLD, 12));
     L7.setBounds(330, 330, 500, 20);
     add(L7);

     JLabel L8 = new JLabel("PIIN:");
     L8.setFont(new Font("Raleway", Font.BOLD, 18));
     L8.setBounds(100, 370, 200, 30);
     add(L8);

     JLabel L9 = new JLabel("XXXX");
     L9.setFont(new Font("Raleway", Font.BOLD, 18));
     L9.setBounds(330, 370, 200, 30);
     add(L9);

     JLabel L10 = new JLabel("(4-digit Password)");
     L10.setFont(new Font("Raleway", Font.BOLD, 12));
     L10.setBounds(100, 400, 200, 20);
     add(L10);

     JLabel L11 = new JLabel("Services Required:");
     L11.setFont(new Font("Raleway", Font.BOLD, 18));
     L11.setBounds(100, 450, 200, 30);
     add(L11);

     c1 = new JCheckBox("ATM CARD");
     c1.setBackground(new Color(215, 252, 252));
     c1.setFont(new Font("Ralewat", Font.BOLD, 16));
     c1.setBounds(100, 500, 200, 30);
     add(c1);

     c2 = new JCheckBox("Internet Banking");
     c2.setBackground(new Color(215, 252, 252));
     c2.setFont(new Font("Ralewat", Font.BOLD, 16));
     c2.setBounds(350, 500, 200, 30);
     add(c2);

     c3 = new JCheckBox("Mobile Banking");
     c3.setBackground(new Color(215, 252, 252));
     c3.setFont(new Font("Ralewat", Font.BOLD, 16));
     c3.setBounds(100, 550, 200, 30);
     add(c3);

     c4 = new JCheckBox("Email Alerts");
     c4.setBackground(new Color(215, 252, 252));
     c4.setFont(new Font("Ralewat", Font.BOLD, 16));
     c4.setBounds(350, 550, 200, 30);
     add(c4);

     c5 = new JCheckBox("Cheque Book");
     c5.setBackground(new Color(215, 252, 252));
     c5.setFont(new Font("Ralewat", Font.BOLD, 16));
     c5.setBounds(100, 600, 200, 30);
     add(c5);

     c6 = new JCheckBox("E-Statement");
     c6.setBackground(new Color(215, 252, 252));
     c6.setFont(new Font("Ralewat", Font.BOLD, 16));
     c6.setBounds(350, 600, 200, 30);
     add(c6);

     JCheckBox c7 = new JCheckBox("I here by declare that the above entered details correct to the best of my knowledge. ", false);
     c7.setBackground(new Color(215, 252, 252));
     c7.setFont(new Font("Raleway", Font.BOLD, 12));
     c7.setBounds(100, 680, 600, 20);
     add(c7);

     JLabel L12 = new JLabel("Form No:-");
     L12.setFont(new Font("Raleway", Font.BOLD, 18));
     L12.setBounds(700, 10, 100, 30);
     add(L12);

     JLabel L13 = new JLabel("formno");
     L13.setFont(new Font("Raleway", Font.BOLD, 14));
     L13.setBounds(760, 10, 60, 30);
     add(L13);

     s = new JButton("Submit");
     s.setFont(new Font("Raleway", Font.BOLD, 14));
     s.setBackground(Color.BLACK);
     s.setForeground(Color.WHITE);
     s.setBounds(250, 720, 100, 30);
     s.addActionListener(this);
     add(s);

     c = new JButton("Cancel");
     c.setFont(new Font("Raleway", Font.BOLD, 14));
     c.setBackground(Color.BLACK);
     c.setForeground(Color.WHITE);
     c.setBounds(420, 720, 100, 30);
     c.addActionListener(this);
     add(c);

     getContentPane().setBackground(new Color(215, 252, 252));
     setSize(850, 800);
     setLocation(400, 20);
     setLayout(null);
     //setUndecorated(true);
     setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String atype = null;
     if (r1.isSelected()){
      atype = "Saving Account";
     } else if (r2.isSelected()) {
      atype ="Fixed Deposit Account";
     }else if (r3.isSelected()){
      atype ="Current Account";
     }else if (r4.isSelected()){
      atype = "Recurring Deposit Account";
     }

     Random ran = new Random();
     long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
     String cardno = "" + Math.abs(first7);

     long first3 = (ran.nextLong() % 9000L)+ 1000L;
     String pin = "" + Math.abs(first3);

     String fac = "";
     if(c1.isSelected()){
      fac = fac+"ATM CARD ";
     } else if (c2.isSelected()) {
      fac = fac+"Internet Banking";
     } else if (c3.isSelected()) {
      fac = fac+"Mobile Banking";
     } else if (c4.isSelected()) {
      fac = fac+"EMAIL Alerts";
     } else if (c5.isSelected()) {
      fac=fac+"Cheque Book";
     } else if (c6.isSelected()) {
      fac=fac+"E-Statement";
     }

     try {
      if (e.getSource()==s){
       if (atype.equals("")){
        JOptionPane.showMessageDialog(null,"Fill all the fields");
       }else {
        Con c = new Con();
        String q1 = "insert into signupthree values('"+formno+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
        String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
        c.statement.executeUpdate(q1);
        c.statement.executeUpdate(q2);
        JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
        new Deposit(pin);
        setVisible(false);
       }
      } else if (e.getSource()==c) {
       System.exit(0);
      }

     }catch (Exception E){
      E.printStackTrace();
     }

    }
     public static void main(String[] args) {
      new Signup3("");
}


}
