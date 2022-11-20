package classes;

public class table {
	private customer Customer;
	private helper Helper;
	private product Product;
	private seller Seller;
	
	//Конструктор класса без параметров.
	public table() {
		Customer = new customer();
		Helper = new helper();
		Product = new product();
		Seller = new seller();
	}

	//Конструктор класса с одним параметром.
	public table(customer Cu) {
		Customer = Cu;
		Helper = new helper();
		Product = new product();
		Seller = new seller();
	}
	
	//Конструктор класса со всеми параметрами.
	public table(customer Cu, helper He, product Pr, seller Se) {
		Customer = Cu;
		Helper = He;
		Product = Pr;
		Seller = Se;
	}
	
	//Метод ввода.
	public void table_input() {
		Customer.customer_input();
		Helper.helper_input();
		Product.product_input();
		Seller.seller_input();
	}

	//Метод вывода.
	public void table_output() {
		Customer.customer_output();
		Helper.helper_output();
		Product.product_output();
		Seller.seller_output();
	}
	

}