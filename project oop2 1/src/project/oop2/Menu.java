package project.oop2;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
//import static javafx.application.Platform.exit;
import javax.swing.*;

public class Menu extends JFrame {

    ImageIcon a3mk = new ImageIcon("3mk.jpg");
    ImageIcon avengers = new ImageIcon("avengers.JPG");
    ImageIcon titanic = new ImageIcon("titanic.JPG");
    ImageIcon superman = new ImageIcon("superMan.JPG");
    ImageIcon spiderman = new ImageIcon("spiderman.JPG");
    ImageIcon thehulk = new ImageIcon("thehulk.JPG");

    JButton B1 = new JButton(a3mk);
    JButton B2 = new JButton(avengers);
    JButton B3 = new JButton(titanic);
    JButton B4 = new JButton(superman);
    JButton B5 = new JButton(spiderman);
    JButton B6 = new JButton(thehulk);
    
    JLabel L1 = new JLabel("Live Movies Now:");
    JLabel L2= new JLabel("One Piece Film: Red");
    JLabel L3= new JLabel("Avengers: Endgame");
    JLabel L4= new JLabel("Titanic:");
    JLabel L5= new JLabel("Superman ");
    JLabel L6= new JLabel("Spider-Man: No Way Home");
    JLabel L7= new JLabel("Hulk");
   //Where the GUI is created:
    JMenuBar menuBar;
    JMenu menu1, menu2, menu3, submenu;
    JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;

    Menu() {
        setTitle("Menu");
        setSize(1040, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        //Font & Color
        L1.setForeground(Color.BLUE);
        L1.setFont(new Font("Serif", Font.BOLD, 18));
        
        L2.setForeground(Color.RED);
        L2.setFont(new Font("Serif", Font.BOLD,14));
        
        L3.setForeground(Color.RED);
        L3.setFont(new Font("Serif", Font.BOLD,14));
        
        L4.setForeground(Color.RED);
        L4.setFont(new Font("Serif", Font.BOLD,14));
        
        L5.setForeground(Color.RED);
        L5.setFont(new Font("Serif", Font.BOLD,14));
        
        L6.setForeground(Color.RED);
        L6.setFont(new Font("Serif", Font.BOLD,14));
        
        L7.setForeground(Color.RED);
        L7.setFont(new Font("Serif", Font.BOLD,14));
        
        
//Create the menu bar.
        menuBar = new JMenuBar();

//Build the first menu.
        menu1 = new JMenu(" Ticket ");
        menu1.setMnemonic(KeyEvent.VK_A);
        menu1.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(menu1);

        menuItem1 = new JMenuItem("Book a movie", KeyEvent.VK_T);
        menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
//menuItem1.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu1.add(menuItem1);
        menuItem1.addActionListener(new Ac());

        menuItem2 = new JMenuItem("Your Tickets", KeyEvent.VK_T);
        menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem1.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu1.add(menuItem2);
        menuItem2.addActionListener(new Ac());

//Build the first menu.
        menu2 = new JMenu("View");
        menu2.setMnemonic(KeyEvent.VK_A);
        menu2.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu2);


//a submenu
        menu2.addSeparator();
        submenu = new JMenu("File Options");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem3 = new JMenuItem("delete history");
        menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
        submenu.add(menuItem3);
        menuItem3.addActionListener(new Ac());
        
        
       
        menu2.add(submenu);

        B1.setBounds(220, 70, 165, 234);
        add(B1);
        L2.setBounds(240, 315, 170, 20);
        add(L2);

        B2.setBounds(500, 60, 165, 248);
        add(B2);
        L3.setBounds(520, 315, 170, 20);
        add(L3);

        B3.setBounds(790, 75, 165, 228);
        add(B3);
        L4.setBounds(850, 315, 170, 20);
        add(L4);
        
        B4.setBounds(220, 360, 165, 228);
        add(B4);
        L5.setBounds(270, 595, 170, 20);
        add(L5);
        
        B5.setBounds(500, 360, 165, 228);
        add(B5);
        L6.setBounds(500, 595, 170, 20);
        add(L6);
        
        B6.setBounds(800, 360, 165, 228);
        add(B6);
        L7.setBounds(870, 595, 170, 20);
        add(L7);
        
        
    
        L1.setBounds(60, 30, 170, 20);
        add(L1);

        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void clearFile()

{ 

    try{

    FileWriter fw = new FileWriter("Tickets.txt", false);

    PrintWriter pw = new PrintWriter(fw, false);

    pw.flush();

    pw.close();

    fw.close();

    }catch(Exception exception){

        System.out.println("Exception have been caught");

    }

}
    
    public class Ac implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == menuItem1) {
                BookMovie BookMovie = new BookMovie();
                dispose();
            } else if (e.getSource() == menuItem2) {
                showTickets showTickets = new showTickets();
                dispose();
            } else if (e.getSource() == menuItem3) {
                clearFile();
                System.out.println("worked");
            } else if (e.getSource() == menuItem6) {
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        }
    }

}
