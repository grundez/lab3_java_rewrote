import classes.*;

public class main {
    public static void main(String args[]) {
        System.out.println();
        int customer_id = 28;
        String customer_name = "ПетровББ";
        customer customer1 = new customer();
        customer customer2 = new customer(customer_id, customer_name);
        customer customer3 = new customer(customer_id);
        customer1.customer_input();
        System.out.println("\n" + "client1:");
        customer1.customer_output();
        System.out.println("\n" + "client2:");
        customer2.customer_output();
        System.out.println("\n" + "client3: ");
        customer3.customer_output();
        System.out.println("\n");

        float helper_mark = 5;
        String helper_name = "ИвановАА";
        helper helper1 = new helper();
        helper helper2 = new helper(helper_mark, helper_name);
        helper helper3 = new helper(helper_mark);
        helper1.helper_input();
        System.out.println("\n" + "helper1:");
        helper1.helper_output();
        System.out.println("\n" + "helper2:");
        helper2.helper_output();
        System.out.println("\n");
        helper3.helper_output();
        System.out.println("\n");

        int product_count = 32;
        String product_name = "Куртка";
        float product_price = 15000;
        product product1 = new product();
        product product2 = new product(product_price, product_name, product_count);
        product product3 = new product(product_name);
        product1.product_input();
        System.out.println("\n" + "product1:");
        product1.product_output();
        System.out.println("\n" + "product2:");
        product2.product_output();
        System.out.println("\n");
        System.out.println("\n" + "product3:");
        product3.product_output();
        System.out.println("\n");

        int seller_sells = 88;
        String seller_name = "Продавец1";
        seller seller1 = new seller();
        seller seller2 = new seller(seller_sells, seller_name);
        seller seller3 = new seller(seller_name);
        seller1.seller_input();
        System.out.println("\n" + "seller1:");
        seller1.seller_output();
        System.out.println("\n" + "seller2:");
        seller2.seller_output();
        System.out.println("\n"+ "seller3:");
        seller3.seller_output();
        System.out.println("\n");
		
		table tb1 = new table();
        table tb2 = new table(customer1, helper1, product2, seller3);
        tb1.table_input();
        System.out.println("\n" + "tb1:");
        tb1.table_output();
        System.out.println("\n" + "tb2:");
        tb2.table_output(); 
    }
}