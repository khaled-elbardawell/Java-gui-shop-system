
package testjava;


public class cart {
    String C_name;
    double C_price;
    int C_Combo_quantity;
    String C_dic;
          
    public cart(String C_name, double C_price, int C_Combo_quantity, String C_dic) {
        this.C_name = C_name;
        this.C_price = C_price;
        this.C_Combo_quantity = C_Combo_quantity;
        this.C_dic = C_dic;
    }

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String C_name) {
        this.C_name = C_name;
    }

    public double getC_price() {
        return C_price;
    }

    public void setC_price(double C_price) {
        this.C_price = C_price;
    }

    public int getC_Combo_quantity() {
        return C_Combo_quantity;
    }

    public void setC_Combo_quantity(int C_Combo_quantity) {
        this.C_Combo_quantity = C_Combo_quantity;
    }

    public String getC_dic() {
        return C_dic;
    }

    public void setC_dic(String C_dic) {
        this.C_dic = C_dic;
    }
          
}
