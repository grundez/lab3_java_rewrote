package classes;
import java.util.Scanner;

public class product implements shopper{
	protected float product_price;
	protected String product_name;
	protected int product_count;

	//Конструкто р класса без параметров.
	public product() {
		product_price = 0;
		product_name = "Нет имени";
		product_count = 0;
	}

	//Конструктор класса с одним параметром.
	public product(String name) {
		product_price = 0;
		product_name = name;
		product_count = 0;
	}
	
	//Конструктор класса со всеми параметрами.
	public product(float price, String name, int count) {
		product_price = price;
		product_name = name;
		product_count = count;
	}
	
	//Конструктор для создания клона объекта
	public product(product pr) {  // передача объекта конструктору
		product_price = pr.product_price;
		product_name = pr.product_name;
		product_count = pr.product_count;
	}

	
	//Метод ввода.
	public void product_input() {
		int price;
		Scanner inpt = new Scanner(System.in, "Cp1251");
		System.out.print("Введите название товара: ");
		product_name = inpt.nextLine();
		System.out.print("Введите цену на товар: ");
		price = inpt.nextInt();
		try{
			if(price > 50000000 || price < 1) throw new Exception("Неправильная цена товара");	
		}
		catch(Exception ex){
         	System.out.println(ex.getMessage());
		}
		finally{
			product_price = price;
		}
		System.out.print("Введите количество товара: ");
		product_count = inpt.nextInt();
	}

	//Метод вывода.
	public void product_output() {
		System.out.println("Название товара: " + product_name);
		System.out.println("Стоимость товара: " + product_price);
		System.out.println("Количество товара: " + product_count);
	}

	public float get_product_price(){
		return product_price;
	}

	public int get_product_count(){
		return product_count;
	}

	public String get_product_name(){
		return product_name;
	}

	public void compare_products(product pr){
		if (this.product_price > pr.product_price){
			System.out.println(this.product_name + " - дороже");
		}
		else if (this.product_price < pr.product_price){
			System.out.println(this.product_name + " - дешевле");
		}
		else{
			System.out.println(" - одинаковы по цене");
		}
	}

	public String toString() {
        return "Название продукта: " + product_name + "\nКоличество продукта: " + product_count + "\nЦена продукта: " + product_price;
    }
	
	
	///для перегруза в производном классе
	public double price_calc(product pr1, product pr2){
        return pr1.product_price + pr2.product_price;
    }
	public double price_calc(product pr1){
        return this.product_price + pr1.product_price;
    }

	
	@Override
	public void put_in() {
		System.out.println("\nПоложить в корзину!\n");
	}

	@Override
	public void put_out() {
		System.out.println("\nУдалить из корзины!\n");
	}

	@Override
	public void made_order() {
		System.out.println("\nСделать заказ!\n");
	}

	
}