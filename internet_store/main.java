import classes.*;

public class main {
    public static void main(String args[]) {
        System.out.println();
        int customer_id = 28;
        String customer_name = "Петров П.П.";
        customer Customer1 = new customer();
        customer Customer2 = new customer(customer_id, customer_name);
        customer Customer3 = new customer(customer_id);
        Customer1.customer_input();
        System.out.println("\n" + "client1:");
        Customer1.customer_output();
        System.out.println("\n" + "client2:");
        Customer2.customer_output();
        System.out.println("\n" + "client3: ");
        Customer3.customer_output();
        System.out.println("\n");

        
    }
}