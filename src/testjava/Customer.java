
package testjava;

import java.util.ArrayList;

public class Customer  {
    int c_id;
    String c_name;
    String c_Address;
    Object c_username;
    Object c_password;
    ArrayList<cart> cartList = new ArrayList<>(); // cart customer
    ArrayList<k> b = new ArrayList<>();// اشعارات 
    ArrayList<k> favourites = new ArrayList<>();// المفضلة 

    public Customer(int c_id,String c_name,String c_address,Object c_username,Object c_password){
        this.c_id=c_id;
        this.c_name=c_name;
        this.c_Address=c_address;
        this.c_username=c_username;
        this.c_password=c_password;
        
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public String getC_name() {
        return c_name;
    }
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    public String getC_Address() {
        return c_Address;
    }
    public void setC_Address(String c_Address) {
        this.c_Address = c_Address;
    }
    public Object getC_username() {
        return c_username;
    }
    public void setC_username(Object c_username) {
        this.c_username = c_username;
    }
    public Object getC_password() {
        return c_password;
    }
    public void setC_password(Object c_password) {
        this.c_password = c_password;
    }
    public ArrayList<cart> getCart() {
        return cartList;
    }
    public void setCart(cart c) {
      
      this.cartList.add(c);
    } 
}
