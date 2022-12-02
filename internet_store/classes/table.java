package classes;

public class table {
    public static int table_count = 0;
    private customer Customer;
    private helper Helper;
    private product Product;
    private seller Seller;

    public table() {
        Customer = new customer();
        Helper = new helper();
        Product = new product();
        Seller = new seller();
        table_count++;
    }

    public table(customer cu, helper he, product pr, seller se) {
        Customer = cu;
        Helper = he;
        Product = pr;
        Seller = se;
        table_count++;
    }

    public table(customer cu, product pr) {
        Customer = cu;
        Helper = new helper();
        Product = pr;
        Seller = new seller();
        table_count++;
    }
    
    public void table_input() {
        Customer.customer_input();
        Helper.helper_input();
        Product.product_input();
        Seller.seller_input();
    }

    public void table_output() {
        Customer.customer_output();
        Helper.helper_output();
        Product.product_output();
        Seller.seller_output();
    }

    public float get_deal_price(){
        float mult = Product.get_product_price() * Product.get_product_count();
        return mult;
    }
    
    public static int get_table_counts(){
        return table_count;
    }
}