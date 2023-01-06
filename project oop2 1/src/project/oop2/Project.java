/*
hussain babonji 2140275
saud alramadany 2141026
abd-alrahman shaaby 2142263
tarad basfar 2141154

*/

package project.oop2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {
    public JLabel label1;
    public JButton button1;
   
    public Project(){
    setTitle("Cinema Ticket");
    setSize(400,200);
    setLocationRelativeTo(null);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    label1= new JLabel("Welcome To Cinema Ticket Booker");
    label1.setBounds(100, 20, 200, 30);
    add(label1);
    
    button1=new JButton("Sign up");
    button1.setBounds(135, 100, 120, 30);
    
    button1.addActionListener(this);

    add(button1);

    setVisible(true);
    }
    public static void main(String[] args) {
    new Project();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button1){
        TicketCreate TicketCreate= new TicketCreate();
            dispose();

    }
 

    }
    
    
}