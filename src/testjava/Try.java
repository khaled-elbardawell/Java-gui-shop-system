
package testjava;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Enumeration;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

// class JTree

public class Try extends JFrame implements ActionListener  {
    JTextField tt1;
    JTextField tt2;
    JTextArea a1;
    JLabel l1,l2,l3,l4;
    public static JLabel ln;
    JComboBox com1; 
    JButton b,b1,b2,b3,b4,b5,b6,b7;
    // u للتحكم بقيمة الليبيل الموجودة بكلاس التشيك اوت 
    public static double u=0,u1;
    public static  JPanel p1,p2,p3;
    Container c;
    JTree t1;
    Font f1 = new Font("Tahoma", Font.PLAIN, 18);
    
    public Try() {
        super("");
        c=this.getContentPane();
        c.setLayout(null);
             
        // تصميم البانيل و الازرار
        p1=new JPanel();
        p1.setBounds(20, 20, 900, 110);
        c.add(p1);

        // لعمل حدود للبانيل
        Border bb=BorderFactory.createLineBorder(Color.BLACK);
        p1.setBorder(bb);
        p1.setLayout(null);
        
        b=new JButton("Login");
        b.setFont(f1);
        b.setBounds(35,10,150,40);
        p1.add(b);
             
             
        b7=new JButton("LogOut");
        b7.setFont(f1);
        b7.setBounds(35,60,150,20);
        p1.add(b7);

        b4=new JButton("Notifications");
        b4.setFont(f1);
        b4.setBounds(300,30,150,40);
        p1.add(b4);
             
        ln=new JLabel("An Account : ");
        ln.setFont(f1);
        ln.setBounds(35,75,200,40);
        p1.add(ln);
             
        b1=new JButton("Shope prouduct");
        b1.setFont(f1);
        b1.setBounds(490,30,180,40);
        p1.add(b1);

        b2=new JButton("View Cart");
        b2.setFont(f1);
        b2.setBounds(700,10,180,40);
        p1.add(b2);
             
        b6=new JButton("View favourites");
        b6.setFont(f1);
        b6.setBounds(700,60,180,40);
        p1.add(b6);

        p2=new JPanel(new GridLayout());

        p2.setBounds(20,150,400,490);
             
        // JTree
        DefaultMutableTreeNode m = new  DefaultMutableTreeNode("eStore"); // رأس التري
        DefaultMutableTreeNode M[]=new DefaultMutableTreeNode[store.dd.size()];   // الي بدنا نحطهم التري   Department        
        DefaultMutableTreeNode M1[]; // الي بدنا نحطهم داخل القسم تبعهم بالتري proudct
        
        for(int i=0;i<store.dd.size();i++){
          M[i]=new DefaultMutableTreeNode(store.dd.get(i).d_name);
          m.add(M[i]);
          M1=new DefaultMutableTreeNode[store.dd.get(i).p_list.size()];
          
          for(int g=0;g<store.dd.get(i).p_list.size();g++){
              M1[g]=new DefaultMutableTreeNode(store.dd.get(i).p_list.get(g).P_name);
              M[i].add(M1[g]);
          }
        }
        
        t1=new JTree(m);
        t1.setFont(f1);
        JScrollPane s1=new JScrollPane(t1);
        p2.add(s1);   
        c.add(p2); // end JTree
            
              
        p3=new JPanel(null);
        p3.setBounds(470,150,450,450);
        
        l1=new JLabel("Quantity :");
        l1.setFont(f1);
        l1.setBounds(10,20,100,40);
        p3.add(l1);    
        
        com1=new JComboBox();
        JScrollPane ss=new JScrollPane(com1);
        ss.setBounds(90,25,60,30);

        p3.add(ss);
        p3.setBorder(bb);
        p3.setBackground(Color.WHITE);
        c.add(p3);
        
        b3=new JButton("Add to Cart");
        b3.setFont(f1);
        b3.setBounds(220,25,150,40);
        p3.add(b3);
        
        l2=new JLabel("Product :");
        l2.setFont(f1);
        l2.setBounds(10,80,100,40);
        p3.add(l2);
        
        tt1=new JTextField();
        tt1.setBounds(90,90,150,25);
        tt1.setEditable(false);
        p3.add(tt1);

        b5=new JButton("Add to favourites");
        b5.setFont(f1);
        b5.setBounds(260,90,180,40);
        p3.add(b5);

        l3=new JLabel("Price :");
        l3.setFont(f1);
        l3.setBounds(10,140,100,40);
        p3.add(l3);

        tt2=new JTextField();
        tt2.setBounds(90,150,150,25);
        tt2.setEditable(false);
        p3.add(tt2);

        l4=new JLabel("Description :");
        l4.setFont(f1);
        l4.setBounds(10,200,120,40);
        p3.add(l4);
        
        a1=new JTextArea();
        JScrollPane s2=new JScrollPane(a1);
        s2.setBounds(20,250,400,150);
        p3.add(s2);
        // ِActions Buttons
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);   
        b4.addActionListener(this);   
        b5.addActionListener(this);   
        b6.addActionListener(this);   
        b7.addActionListener(this);   
                
                                                  
        // قمنا باخفاء التري والبانيل الاخر بالوضع الطبيعي لانه لسا ما سجلنا دخول   
       p3.hide();
       p2.hide();

        // ِAction JTree
        t1.addMouseListener(new MouseListener() {
        @Override
            public void mouseClicked(MouseEvent me) {
                try{ // لانه بيطلع اكسبشين بحالة انه دعسنا على اي مكان ثاني غير المنتجات 
                       
                    // هان بنجيب النود الي حددناها على التري وبنحولها لنص   
                    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) t1.getSelectionPath().getLastPathComponent();
                    String x= selectedNode.getUserObject().toString();
                    // قمنا بترتيب كل الاغراض المضافة الى السوق بداخل التري 
                    for(int i =0;i<store.dd.size();i++){
                        for(int g=0;g<store.dd.get(i).p_list.size();g++){
                            if(x.equals(store.dd.get(i).p_list.get(g).getP_name())){
                                tt1.setText(store.dd.get(i).p_list.get(g).P_name);
                                tt2.setText(store.dd.get(i).p_list.get(g).p_price+"");
                                int P_quantity = store.dd.get(i).p_list.get(g).P_quantity ;
                                for(int ii=1;ii<=(P_quantity*10);ii++){
                                    com1.addItem(ii);
                                }                     
                                a1.setText(store.dd.get(i).p_list.get(g).P_dic);
                            }
                        }
                    }
                }catch(Exception e){
                } 
            } 

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        }); // نهاية حدث التري
         
          
        setSize(960,700);
        setLocation(550,200);
        setResizable(false);
        setVisible(true);
    } // نهاية الكونستركتور
  
  
    // جميع احداث الازرار بالواجهة

    @Override
    public void actionPerformed(ActionEvent e) {
      
        // زر تسجيل الدخول
        if(e.getSource()==b){
          new LoginWindow();
        }//end
        //  Button shop proudct  
        else if(e.getSource()==b1){
            if(LoginWindow.o==1){
              p3.show();
              p2.show();
            }else {
                JOptionPane.showMessageDialog(null,"please Login ");
            }
        } // end 
        // Button viwe cart
        else if(e.getSource()==b2){
         // اذا تم تسجيل الدخول بنجاح بيشتغل
            if(LoginWindow.o==1){
                // هذا علشان يتحكم بالليبل الموجود بكلاس التشيك اوت  يتحم بالسعر يعني 
                for(int ii=0;ii<store.cc.size();ii++){
                    if((LoginWindow.un.equals(store.cc.get(ii).c_username))){
                        if(LoginWindow.pass.equals(store.cc.get(ii).c_password)){
                            // الوضع الطبيعي تكون صفر لكن اذا ضفنا على السلة فانه لازم اضرب السعر بالكمية الي انا اخترتها وضفتها على السلة واعدلها بالليبل بكلاس التشيك اوت 
                            u1=0;
                            for(int gg=0;gg<store.cc.get(ii).cartList.size();gg++){
                                int x= store.cc.get(ii).cartList.get(gg).C_Combo_quantity;
                                double y= store.cc.get(ii).cartList.get(gg).C_price;
                                u= (u+(x*y));  
                                u1=u;
                            }
                        }
                    }
                    u=0;
                }
                new checkout();
            }else {             
                JOptionPane.showMessageDialog(null,"please Login ");
            }
        } //end else if
        //Button logout
        else if(e.getSource()==b7){
            LoginWindow.o=0;
            Try.p2.hide();
            Try.p3.hide();
            ln.setText("An Account : " );
            //LoginWindow.r=2;
        }
        // Button Add to Cart
        else if(e.getSource()==b3){
            String t1=tt1.getText();
            double price= Double.parseDouble(tt2.getText());
            int com=Integer.parseInt( com1.getSelectedItem()+"");
            String aa=a1.getText();
            //للاضافة بالسلة
            for(int ii=0;ii<store.dd.size();ii++){
                for(int gg=0;gg<store.dd.get(ii).p_list.size();gg++){
                    if(t1.equals(store.dd.get(ii).p_list.get(gg).P_name)){ 
                        if(com<=store.dd.get(ii).p_list.get(gg).getP_quantity()){ // تأكدنا انه الكمية المختارة موجودة بالسوق
                            store.dd.get(ii).p_list.get(gg).setP_quantity(   store.dd.get(ii).p_list.get(gg).getP_quantity()-com);
                            cart ca=new cart(t1,price,com,aa);
                            for(int i=0;i<store.cc.size();i++){
                                // تأكدنا من المستخدم 
                                if((LoginWindow.pass.equals(store.cc.get(i).c_password)) && (LoginWindow.un.equals(store.cc.get(i).c_username))){
                                    // ضفنا على السلة
                                    store.cc.get(i).cartList.add(ca);
                                }
                            }  
                        }
                        // اذا كانت الكمية المختارة غير متوفرة
                        else {
                            for(int i=0;i<store.cc.size();i++){
                                if( (LoginWindow.un.equals(store.cc.get(i).c_username))){
                                    if(store.checkNof(t1)==false){ // للتأكد من ان الاشعار غير مكرر  
                                        int m= JOptionPane.showConfirmDialog(null, "Quantity is currently unavailable !! \n Would you like to inform you if the quantity is available?  ", "", 1);
                                        // هذا كلاس  موجود اسفل هذا الكلاس
                                        // علشان اقدر اخزن الاسم والكمية وابعتها لقائمة الاشعارات  في حال توفر الكمية يتم مقارنة هذه الكمية بالكمية الموجودة بالسوق و يظهر الاشعار
                                        k o=new k(t1,com);
                                         // رسالة التحذيؤ
                                        switch(m){
                                            case 0: store.cc.get(i).b.add(o); break; // ok  زر 
                                            case 1:  break;
                                            case 2:  break;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                 }      
            }
        } //end 

        // Notifications Button
        else if(e.getSource()==b4){
            if(LoginWindow.o==1){            
                // هذا في حالة ظهور رسالة التحذير ودعست اوك فانه بيتخزن بمصفوفة وفي حالة زادت الكمية بالسوق فانه هادي المصفوفة بتبعت الاشعار 
                // b اسم المصفوفة  تبعت الاشعارات 
                for(int i=0;i<store.cc.size();i++){
                    if((LoginWindow.un.equals(store.cc.get(i).c_username))){               
                        for(int g=0;g<store.cc.get(i).b.size();g++){
                            for(int u=0;u<store.dd.size();u++){
                                for(int f=0;f<store.dd.get(u).p_list.size();f++){
                                    if(store.cc.get(i).b.get(g).x.equals(store.dd.get(u).p_list.get(f).P_name)){
                                        if(store.cc.get(i).b.get(g).c<=store.dd.get(u).p_list.get(f).P_quantity){
                                            JOptionPane.showMessageDialog(null, "There is an available quantity of "+store.dd.get(u).p_list.get(f).P_name+ " >>  "+store.dd.get(u).p_list.get(f).P_quantity);     
                                        }
                                    }
                                }
                            }
                        }
                    }
                }           
                 // هذا علشان يلف على مصفوفة المفضلة ويبعت الاشعاارت 
                for(int i=0;i<store.cc.size();i++){
                    if((LoginWindow.un.equals(store.cc.get(i).c_username))){
                        for(int g=0;g<store.cc.get(i).favourites.size();g++){
                            for(int u=0;u<store.dd.size();u++){
                                for(int f=0;f<store.dd.get(u).p_list.size();f++){
                                    if(store.cc.get(i).favourites.get(g).x.equals(store.dd.get(u).p_list.get(f).P_name)){
                                        if(store.cc.get(i).favourites.get(g).c<store.dd.get(u).p_list.get(f).P_quantity){
                                            JOptionPane.showMessageDialog(null, "There are new quantities of this product >>" +store.dd.get(u).p_list.get(f).P_name);
                                        }
                                    }
                                }
                            }       
                        }
                    }
                }
                  
                  
            }else {
                JOptionPane.showMessageDialog(null,"please Login ");
            }
        } // end

           else 
               
               // Button Add to favourites
               if(e.getSource()==b5){
             int com=Integer.parseInt( com1.getSelectedItem()+"");
             String t1=tt1.getText();
                 k o=new k(t1,com);
                       for(int i=0;i<store.cc.size();i++){
                     if( (LoginWindow.un.equals(store.cc.get(i).c_username))){                        
                       if(store.checkFivourites(t1)==false){
                      
                      store.cc.get(i).favourites.add(o);
                
                     }
                       }
              
                }
                     
           }
           // View favourites
           else  if(e.getSource()== b6){
                if(LoginWindow.o==1){
                String t1=tt1.getText();
                 
               for(int i=0;i<store.cc.size();i++){
             if( (LoginWindow.un.equals(store.cc.get(i).c_username))){  
                  listFavourites.f.clear();
                 for(int g=0;g<store.cc.get(i).favourites.size();g++){  
                   listFavourites.f.add(g,store.cc.get(i).favourites.get(g).x);
            
                 }
             }
               }
              new listFavourites();
           }
           else{
             JOptionPane.showMessageDialog(null,"please Login ");
           }
           } // end
      
      
      
    } // نهاية دالة الاحداث
    
    public static void main(String[] args) {
        new Try();
    }

} // نهاية الكلاس


  // class k

          class k{
            String x;
            int c;
         public k(String x,int c){
         this.x=x;
         this.c=c;
    }
} // end class k