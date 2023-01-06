package project.oop2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class BookMovie extends JFrame implements ActionListener{
    JButton button;
    JComboBox movies;
    String[] Lmovie = {"","titanic","super man","avengers","spiderman","the hulk","one piece"};
    BookMovie() {
        setTitle("Movie Boking");
    setSize(400,200);
    setLocationRelativeTo(null);
    setLayout(null);
    //setDefaultCloseOperation(3);
    
    
    JLabel movie = new JLabel("movies");
    movie.setBounds(20, 60,150, 30);
    add(movie);
    
    movies= new JComboBox(Lmovie);
    movies.setBounds(70, 60,150, 30);
    add(movies);
    
    button=new JButton("Enter");
    button.setBounds(250,60,90,30);
    add(button);
    
    button.addActionListener(this);
    
    setVisible(true);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String movie_name=(String) movies.getSelectedItem();
        
        if (e.getSource()==button){try {
           FileWriter fw=new FileWriter("Tickets.txt",true);
            fw.write("Movie:"+movie_name+"\n");
            JOptionPane.showMessageDialog(null, "you have chosen: "+movie_name);
            fw.close();
            dispose();}
         catch (IOException ex) {
            Logger.getLogger(BookMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        FinalPrice FinalPrice = new FinalPrice();
        dispose();
        }
    
    }
    
    
    
    
}
