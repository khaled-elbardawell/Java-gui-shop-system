
package testjava;

import java.util.ArrayList;
class Dep{
       
    String d_name;
    String d_description;
    ArrayList<Product> p_list = new ArrayList<>();
        
      
   
    public Dep(String d_name , String d_description ){
        this . d_name = d_name;
        this . d_description = d_description;      
    }
    public ArrayList<Product> getP_list() {
        return p_list;
    }

    public void setP_list(Product p) {
        //this.p_list = p_list;
        this.p_list.add(p);
    }
    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_description() {
        return d_description;
    }

    public void setD_description(String d_description) {
        this.d_description = d_description;
    }
}

