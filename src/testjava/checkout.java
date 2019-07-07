
package testjava;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.border.*;
public class checkout extends JFrame  implements ActionListener {
    Container c;
    JPanel p1,p3;
    public static JPanel p2;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l11,l22,l33;
    public static JLabel lp;
    JTextArea a1;
    double x=0;
    double ee;
    Font f1 = new Font("Tahoma", Font.PLAIN, 18);
  
    public checkout(){
        super("");
        c=this.getContentPane();
        c.setLayout(null);
        
            p1=new JPanel(null);
            p1.setBounds(5,5,960,80);
            Border bb=BorderFactory.createLineBorder(Color.BLACK);
    	    p1.setBorder(bb);
            
            b1=new JButton("Proceed To Checkout");
            b1.setFont(f1);
            b1.setBounds(210,20,230,35);
            p1.add(b1);
            c.add(p1);
                
            lp=new JLabel("Total amount Price of Items in cart is " + (Try.u1));
            lp.setFont(f1);
            lp.setBounds(450,20,400,35);
            p1.add(lp);
                  
            p2=new JPanel();
            p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
            
            JScrollPane sp = new JScrollPane(p2);
            sp.setBounds(5,100,960,500);
            sp.setBorder(bb);
              
            
            for(int i=0;i<store.cc.size();i++){
                if((LoginWindow.un.equals(store.cc.get(i).c_username))){
                    if(LoginWindow.pass.equals(store.cc.get(i).c_password)){
                        for(int g=0;g<store.cc.get(i).cartList.size();g++){
                            p3=new JPanel(null);
                            p3.setBounds(120,10,790,320);
                            p3.setPreferredSize(new Dimension(790,370));
                            p3.setBorder(bb);
                            
                            //1
                            b2=new JButton("Remove");
                            b2.setFont(f1);
                            b2.setBounds(110,300,150,40);
                            p3.add(b2);
                            //2
                            l1=new JLabel("Proudct");
                            l1.setFont(f1);
                            l1.setBounds(20,7,100,20);
                             p3.add(l1);
                            //3
                            l2=new JLabel("Quantity");
                            l2.setFont(f1);
                            l2.setBounds(20,45,100,20);
                            p3.add(l2);
                            //4
                            l3=new JLabel("Description");
                            l3.setFont(f1);
                            l3.setBounds(20,75,100,20);
                            p3.add(l3);
                            //5
                            l4=new JLabel("Total Price");
                            l4.setFont(f1);
                            l4.setBounds(510,7,130,20);
                            p3.add(l4);

                            //6
                            a1=new JTextArea();
                            a1.setFont(f1);
                            JScrollPane s=new JScrollPane(a1);
                            s.setBounds(110,90,620,180);
                            p3.add(s);
                            a1.setText(store.cc.get(i).cartList.get(g).C_dic);
                       
                            //7
                            l11=new JLabel(store.cc.get(i).cartList.get(g).C_name);
                            l11.setFont(f1);
                            l11.setBounds(125,7,200,20);
                            p3.add(l11);
                            //8
                            l22=new JLabel(store.cc.get(i).cartList.get(g).C_Combo_quantity+"");
                            l22.setFont(f1);
                            l22.setBounds(130,45,100,20);
                            p3.add(l22);
                            //9
                            l33=new JLabel(store.cc.get(i).cartList.get(g).C_price +"");
                            l33.setFont(f1);
                            l33.setBounds(650,7,130,20);
                            p3.add(l33);
                     
                            
                       
                            p2.add(p3);
                       
         
                       
                            b2.addActionListener(new ActionListener() {
                            @Override
                                public void actionPerformed(ActionEvent e) {
                         
                                    JPanel pp=(JPanel) ((JButton) e.getSource()).getParent();
                                    JLabel k1= (JLabel) ((JButton)e.getSource()).getParent().getComponent(6);
                                    JLabel k2= (JLabel) ((JButton)e.getSource()).getParent().getComponent(7);
                                    JLabel k3= (JLabel) ((JButton)e.getSource()).getParent().getComponent(8);
                                    String s1=k1.getText();
                                    String s2=k2.getText();
                                    String s3=k3.getText();
                        
                                    for(int i=0;i<store.cc.size();i++){
                                        if((LoginWindow.un.equals(store.cc.get(i).c_username))){
                                            if(LoginWindow.pass.equals(store.cc.get(i).c_password)){
                                                for(int g=0;g<store.cc.get(i).cartList.size();g++){

                                                    String ss1= store.cc.get(i).cartList.get(g).C_name;
                                                    String ss2= store.cc.get(i).cartList.get(g).C_Combo_quantity+"";
                                                    String ss3= store.cc.get(i).cartList.get(g).C_price+"";

                                                        if(ss1.equals(s1)){
                                                            if(ss2. equals(s2)){
                                                                if(ss3.equals(s3)){
                                                                    store.cc.get(i).cartList.remove(g);
                                                                }
                                                            }
                                                        }
                                                }
                                            }
                                        }

                                    }
                                    //  set lebel >> total 
                                    int r= Integer.parseInt(s2);
                                    double r1= Double.parseDouble(s3);
                                    ee= ee+(r*r1);
                                    double cc=Try.u1;
                                    double c=cc-ee;

                                    lp.setText("Total amount Price of Items in cart is " + (c));

                                    //saerch

                                    for(int i=0;i<store.dd.size();i++){
                                        for(int g=0;g<store.dd.get(i).p_list.size();g++){
                                            if(s1.equals(store.dd.get(i).p_list.get(g).P_name)){
                                                int u= Integer.parseInt(s2);
                                                int u1=  store.dd.get(i).p_list.get(g).getP_quantity();
                                                int uu=u1+u;
                                                store.dd.get(i).p_list.get(g).setP_quantity(uu);
                                            }
                                        }
                                    }

                                    p2.remove(( (JButton) e.getSource()).getParent());
                                    p2.repaint();
                                    p2.revalidate();

                                }
                            });
                      
                        }//End for
                    }
                }
            }
                     
                
                 
        c.add(sp);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1000,650);
        setLocation(550,200);
        setVisible(true);
        setResizable(false);
        b1.addActionListener(this);
             

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new CartCheckoutWindow();
        }   
    }
    
}
