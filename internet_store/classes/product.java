package classes;
import java.util.Scanner;

public class product {
	private float product_price;
	private String product_name;
	private int product_count;

	//Конструктор класса без параметров.
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
	
	//Метод ввода.
	public void product_input() {
		Scanner inpt = new Scanner(System.in, "Cp1251");
		System.out.print("Введите название товара: ");
		product_name = inpt.nextLine();
		System.out.print("Введите цену на товар: ");
		product_price = inpt.nextInt();
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
}