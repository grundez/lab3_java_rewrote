import classes.*;

public class main {
    public static void main(String args[]) {
        /*System.out.println();
        String customer_name = "ПетровББ";
        int customer_id = 1;
        customer customer1 = new customer();
        customer customer2 = new customer(customer_name);
        customer customer3 = new customer(customer_id, customer_name);
        
        customer3.customer_input();
        System.out.println("\n" + "customer1:");
        customer1.customer_output();
        System.out.println("\n" + "customer2:");
        customer2.customer_output();
        System.out.println("\n" + "customer3:");
        customer3.customer_output();
        System.out.println("\n");

        System.out.println("Проверка статического поля: " + customer.client_counts); //////////////////РАБОТА СТАТИЧЕСКОГО ПОЛЯ И МЕТОДА
        System.out.println("Количество клиентов через статический метод: " + customer.get_client_counts());
        
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
        System.out.println("\n" + "helper3:");
        helper3.helper_output();
        System.out.println("\n");

        int product_count = 32;
        String product_name = "Шапка";
        float product_price = 15000;
        product product1 = new product();
        product product2 = new product(product_price, product_name, product_count);
        product product3 = new product(product_name);
        product1.product_input();
        System.out.println("\n" + "product1:");
        product1.product_output();
        System.out.println("\n" + "product2:");
        product2.product_output();
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
		
        int tb_i = table.get_table_counts(); //////////МАССИВ ЧЕРЕЗ КОНСТРУКТОРЫ
        Table[0] = new table();
        Table[1] = new table(customer3, product1);
        Table[2] = new table(customer1, helper1, product2, seller3);
        Table[0].table_input(); 
        
        table[] Table = new table[3];
        
        for (int i=0; i < 2; i++){      //////////////////РАБОТА С МАССИВОМ ОБЪЕКТОВ
            System.out.println();
			Table[i] = new table();
            Table[i].table_input();
            System.out.println("Стоймость всего склада "+ (i+1) +" продавца: " + Table[i].get_deal_price());
		}
       
        System.out.println();
        customer cu= new customer();
        helper he = new helper();
        product pr = new product();
        seller se = new seller();
        pr.product_input();
        Table[2] = new table(cu, he, pr, se);
        System.out.println("Стоймость всего склада "+ 3 +" продавца: " + Table[2].get_deal_price());
        
        
        customer cu= new customer();
        cu.customer_input();
        System.out.println("Проверенная функция строки trim: " + cu.trim_fio());  

        helper_class Helper_class = new helper_class();
        System.out.println("Проверка вспомогательного класса(колво клиентов) : " + Helper_class.get_client_counts_helper()); */

        product pr1 = new product();       //////////ПРОВЕРКА РАЗУМНОГО THIS
        product pr = new product();
        pr.product_input();
        pr1.product_input();
        pr1.compare_products(pr);
    }
}