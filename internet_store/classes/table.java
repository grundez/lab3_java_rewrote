package classes;

public class table {
    private customer Customer;
    private helper Helper;
    private product Product;
    private seller Seller;

    public table() {
        Customer = new customer();
        Helper = new helper();
        Product = new product();
        Seller = new seller();
    }

    public table(customer cu, helper he, product pr, seller se) {
        Customer = cu;
        Helper = he;
        Product = pr;
        Seller = se;
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
}