package project.oop2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import static java.nio.file.Files.lines;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;

public class showTickets extends JFrame {

    JTextArea T1 = new JTextArea(18,20);
    
        ImageIcon Back = new ImageIcon("Back2.JPG");
         JButton B1=new JButton(Back);


    JScrollPane scroll = new JScrollPane(T1,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    

    @SuppressWarnings("empty-statement")
    showTickets() {
        setTitle("show tickets");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
       

        B1.setSize(5, 5);
        add(B1);
        B1.addActionListener(new Ac());

        add(scroll);

       
            File file = new File("Tickets.txt");
            String s1 = null;
            String[] lines={};
            int i=0;
            String s2 = null;
            try {
              Scanner sc = new Scanner(file);
                 while (sc.hasNextLine()){
                       s1=sc.nextLine();
                       System.out.println(s1);
                       T1.append(s1+"\n");
                           
                       
                 }
    
            } catch (FileNotFoundException ex) {
                System.out.println("File is not Found!");
            }
                
              
              
               
        
        setVisible(true);
    }
    
    
      public class Ac implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == B1) {
                 Menu  Menu = new  Menu();
                                dispose();

            }
        }
    }
}
