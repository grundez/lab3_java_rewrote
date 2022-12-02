package classes;
import java.util.Scanner;

public class helper {
	private double helper_mark;
	private String helper_name;
	
	//Конструктор класса без параметров.
	public helper() {
		helper_mark = 0;
		helper_name = "нет имени..";
	}

	//Конструктор класса с одним параметром.
	public helper(double mark) {
		helper_mark = mark;
		helper_name = "нет имени..";
	}
	
	//Конструктор класса со всеми параметрами.
	public helper(double mark, String name) {
		helper_mark = mark;
		helper_name = name;
	}
	
	//Метод ввода.
	public void helper_input() {
		Scanner inpt = new Scanner(System.in, "Cp1251");
		System.out.print("Введите помощника: ");
		helper_name = inpt.nextLine();
		System.out.print("Введите оценку помощника: ");
		helper_mark = inpt.nextDouble();
		}

	//Метод вывода.
	public void helper_output() {
		System.out.println("Имя помощника: " + helper_name);
		System.out.println("Оценка помощника: " + helper_mark);
	}
}