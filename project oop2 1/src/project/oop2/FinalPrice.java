/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.oop2;



import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author sh3
 */
public class FinalPrice extends JFrame{
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

    
    JLabel L1 = new JLabel("Choose your experience");
    JLabel L2 = new JLabel("Snacks :");


    JRadioButton r1 = new JRadioButton("Imax (75$)");
    JRadioButton r3 = new JRadioButton("Stander(55$)");

    JCheckBox c1 = new JCheckBox("Pupcorn (15$)");
    JCheckBox c2 = new JCheckBox("Juice (10$)");
    JCheckBox c3 = new JCheckBox("Chocolate (7$)");
    JCheckBox c4 = new JCheckBox("Candy (3$)");

JButton b1 = new JButton("Confirm");
   
           JLabel T1 = new JLabel("");

   
   
   
    FinalPrice() {
        setTitle("Checkout");
        setSize(450, 500);
        setLocationRelativeTo(null);
        setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        L1.setBounds(30, 30, 170, 20);
        r1.setBounds(50, 70, 110, 20);
        r3.setBounds(50, 90, 110, 20);
        add(L1);
        add(r1);
        add(r3);

        L2.setBounds(250, 30, 110, 20);
        c1.setBounds(270, 70, 110, 20);
        c2.setBounds(270, 90, 110, 20);
        c3.setBounds(270, 110, 110, 20);
        c4.setBounds(270, 130, 110, 20);
        
       // T1.setEditable(false);
T1.setBounds(80,200,200,100);
add(T1);
c1.addActionListener(new Ac());c2.addActionListener(new Ac());c3.addActionListener(new Ac());c4.addActionListener(new Ac());
b1.addActionListener(new Ac());
r1.addActionListener(new Ac());r3.addActionListener(new Ac());
add(b1);
b1.setBounds(290,350,100,30);
add(L2);add(c1);add(c2);add(c3);add(c4);

                 
       ButtonGroup G = new ButtonGroup();
       G.add(r1);G.add(r3);
       
       
       setVisible(true);
    }
     
      
       public class Ac implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int Total = 0;
             if (r1.isSelected()|| r3.isSelected()){
            if (c1.isSelected()) {
                Total += 15;
              T1.setText("Your TOTAL WILL BE : "+ Total+"$");

            }else if (c2.isSelected()) {
                Total += 10;
              T1.setText("Your TOTAL WILL BE : "+ Total+"$");

            } else if (c3.isSelected()) {
                Total+=7;
              T1.setText("Your TOTAL WILL BE : "+ Total+"$");

            } else if (c4.isSelected()) {
                Total += 3;
                              T1.setText("Your TOTAL WILL BE : "+ Total+"$");

            }
            
           
                Total+=75;
                              T1.setText("Your TOTAL WILL BE : "+ Total+"$");
               
            
          if (e.getSource()==b1){
              JOptionPane.showMessageDialog(null,"YOUR TICKET HAVE BEEN CREATED ");
              Menu menu = new Menu();
               try {
                    FileWriter fw=new FileWriter("Tickets.txt",true);
                    fw.write("the total pay:"+Total);
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(FinalPrice.class.getName()).log(Level.SEVERE, null, ex);
                }
              dispose();
          }
        }
        }
    }

}
