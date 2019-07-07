
package testjava;


import java.util.ArrayList;

public class Product {
    String P_name;
    double p_price;
    int P_quantity;
    String P_dic;
    String p_com;
  
	
    public Product(String namepro, double price, int quantity, String dicpro,String p_com) {

        this.P_name = namepro;
        this.p_price = price;
        this.P_quantity = quantity;
        this.P_dic = dicpro;
        this. p_com= p_com;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

    public double getP_price() {
        return p_price;
    }

    public void setP_price(double p_price) {
        this.p_price = p_price;
    }

    public int getP_quantity() {
        return P_quantity;
    }

    public void setP_quantity(int P_quantity) {
        this.P_quantity = P_quantity;
    }

    public String getP_dic() {
        return P_dic;
    }

    public void setP_dic(String P_dic) {
        this.P_dic = P_dic;
    }

    public String getP_com() {
        return p_com;
    }

    public void setP_com(String p_com) {
        this.p_com = p_com;
    }

}
    
    

   
	


