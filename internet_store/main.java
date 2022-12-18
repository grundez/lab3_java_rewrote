import java.util.SortedSet;
import java.util.TreeSet;

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
        System.out.println("Проверка вспомогательного класса(колво клиентов) : " + Helper_class.get_client_counts_helper()); 
        
        table[][] Table = new table[1][1];
        int id=0;
        for (int i=0; i < 1; i++){      //////////////////РАБОТА С МАССИВОМ ОБЪЕКТОВ
            for (int j=0; j<1;j++){
                id = i*10 + j+1;
                System.out.println();
			    Table[i][j] = new table();
                Table[i][j].table_input();
                System.out.println("Стоймость всего склада "+ id +" продавца: " + Table[i][j].get_deal_price());
            }
            System.out.println();
		}
        System.out.println("Перегруз метода: " + pr1.price_calc(pr2));
        System.out.println("Перегруз метода: " + pr1.price_calc(pr2, pr3));
        
        */
        
        product_more_info pr1 = new product_more_info(15000, "куртка", 1, 1500, "16", "12", "2022");  
        product pr2 = new product(1000, "шапка", 3);
        
        //System.out.println("Цена товара: " + pr1.get_product_price() + "\nВес товара: " + pr1.get_weight() + "\nДата доставки: " + pr1.get_date());
        System.out.println(pr1); //вывод через toString()
        System.out.println(pr2); //вывод через toString()
        pr1.made_order(); //использование интерфейса для продукта
        

        
        ///////////КОНТЕЙНЕРЫ НА JAVA
        SortedSet<String> product_cont = new TreeSet<>();
        product_cont.add(pr1.get_product_name());
        product_cont.add(pr2.get_product_name());

        System.out.println(product_cont.toString());
    }
}