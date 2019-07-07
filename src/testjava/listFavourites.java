
package testjava;

import javax.swing.*;
import java.awt.*;

// Favourites list
public class listFavourites extends JFrame {
    JList l;
    public static  DefaultListModel f=new DefaultListModel();
    Font f1 = new Font("Tahoma", Font.PLAIN, 18);
    
    public listFavourites(){
        l=new JList();
        l.setFont(f1);
        
      
        JScrollPane s=new JScrollPane(l);
        s.setBackground(Color.WHITE);
        s.setFont(f1);
        l.setModel(f);
        add(s);
        s.setBounds(0,0,200,200);
        
        setSize(400,400);
        setLocation(550,200);
        setResizable(false);
        setVisible(true);
    }
}
