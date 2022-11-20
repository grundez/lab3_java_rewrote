package classes;
import java.util.Scanner;

public class customer {
	private int client_id;
	private String client_FIO;

	//Конструктор класса без параметров.
	public customer() {
		client_id = 0;
		client_FIO = "Имя не указано.";
	}

	//Конструктор класса с одним параметром.
	public customer(int id) {
		client_id = id;
		client_FIO = "Имя не указано.";
	}
	
	//Конструктор класса со всеми параметрами.
	public customer(int id, String name) {
		client_id = id;
		client_FIO = name;
	}
	
	//Метод ввода.
	public void customer_input() {
		Scanner inpt = new Scanner(System.in);
		System.out.print("Введите ФИО клиента: ");
		client_FIO = inpt.nextLine();
		System.out.print("Введите id клиента: ");
		client_id = inpt.nextInt();
	}

	//Метод вывода.
	public void customer_output() {
		System.out.println("ID клиента: " + client_id);
		System.out.println("ФИО клиента: " + client_FIO);
	}
}