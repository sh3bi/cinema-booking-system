package project.oop2;
// sign up class dont forget
import java.awt.*;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;


public class TicketCreate extends JFrame implements ActionListener {
    JLabel prompt,name,phoneNumber,email,age,movie;
    JButton save;
    JTextField Tname,TphoneNumber,Temail,Tage;
    JComboBox movies;
    
    String[] Lmovie = {"","titanic","super man","avengers","spiderman","the hulk","barbie"};
    
    public TicketCreate(){
        setTitle("Sign up");
        setSize(600,300);
        setLocationRelativeTo(null);
        setLayout(null);
       
        
        prompt=new JLabel("Enter your personal information");
        prompt.setBounds(160,10, 200, 20);
        add(prompt);
        
        name=new JLabel("name");
        name.setBounds(20, 50, 50, 30);
        add(name);
        
        Tname=new JTextField("");
        Tname.setBounds(120, 50, 150, 30);
        add(Tname);
        
        phoneNumber=new JLabel("Phone number");
        phoneNumber.setBounds(20,120,120,30);
        add(phoneNumber);
        
        TphoneNumber=new JTextField("");
        TphoneNumber.setBounds(120, 120, 150, 30);
        add(TphoneNumber);
        
        email=new JLabel("Email");
        email.setBounds(300, 50, 50, 30);
        add(email);
        
        Temail=new JTextField();
        Temail.setBounds(350, 50,150, 30);
        add(Temail);
        
        age=new JLabel("age");
        age.setBounds(300, 120, 50, 30);
        add(age);
        
        Tage=new JTextField("",99);
        Tage.setBounds(350, 120,150, 30);
        add(Tage);
        
       
        
        save=new JButton("save");
        save.setMnemonic(KeyEvent.VK_ENTER);
        save.setBounds(350, 190, 80, 30);
        add(save);
        save.addActionListener(this);
        
        
        setVisible(true);
    }
    
    public void FileWriter() throws IOException{
    String name1,age1,phoneNumber1,email1;
    name1=Tname.getText();
    age1=Tage.getText();
    phoneNumber1=TphoneNumber.getText();
    email1=Temail.getText();

    
    FileWriter Writer = new FileWriter("Tickets.txt",true);
    try{
    Writer.write("Name: "+name1);
    Writer.write("\nAge: "+age1);
    Writer.write("\nPhone number: "+phoneNumber1);
    Writer.write("\nEmail: "+email1);
    //Writer.write("\nmovie: "+movie);
    Writer.write("\n");
    Writer.close();
    JOptionPane.showMessageDialog(null, "You have been signed!");
    
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    
    System.out.println(name1+" "+age1+" "+phoneNumber1+" "+email1);
    
    
        }
    }

    static void checkAge(int age1) {
    try{
    if(age1<18){
    throw new ageException("you are under 18!");
    }
    }catch(ageException age){
    JOptionPane.showMessageDialog(null,"You are under 18!!");
    }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==save){
        
        String s=Tage.getText();
        int ss=Integer.parseInt(s);
        String p=TphoneNumber.getText();
     
        if(ss<18){
            checkAge(ss);
            Project Project =new Project();
            dispose();
        }else if(ss>18){
        try {
            FileWriter();
             Menu M = new Menu();
        } catch (IOException ex) {
            Logger.getLogger(TicketCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
   
    
    }
    dispose();
    }
    
    
}
