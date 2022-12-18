package classes;
import java.util.Scanner;

public class seller {
	private int seller_sells;
	private String seller_name;

	//Конструктор класса без параметров.
	public seller() {
		seller_sells = 0;
		seller_name = "Нет имени";
	}

	//Конструктор класса с одним параметром.
	public seller(String name) {
		seller_sells = 0;
		seller_name = name;
	}
	
	//Конструктор класса со всеми параметрами.
	public seller(int sells, String name) {
		seller_sells = sells;
		seller_name = name;
	}
	
	//Метод ввода.
	public void seller_input() {
		Scanner inpt = new Scanner(System.in, "Cp1251");
		System.out.print("Введите имя/название продавца: ");
		seller_name = inpt.nextLine();
		System.out.print("Введите количество продаж: ");
		seller_sells = inpt.nextInt();
	}

	//Метод вывода.
	public void seller_output() {
		System.out.println("Имя/название продавца: " + seller_name);
		System.out.println("Количество продаж: " + seller_sells);
	}
	
	//Метод вывода продаж.
	public int get_sells() {
		return seller_sells;
	}

	public String toString() {
        return "Имя продавца/бренда: " + seller_name + "\nКоличество продаж: " + seller_sells;
    }
}