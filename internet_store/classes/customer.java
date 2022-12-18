package classes;
import java.util.Scanner;

public class customer {
	
	public static int client_counts=0;
	private int client_id;
	private String client_FIO;

	//Конструктор класса без параметров.
	public customer() {
		this.client_FIO = "Имя не указано.";
		this.client_id = 0;
		client_counts++;
	}

	//Конструктор класса с одним параметром.
	public customer(String name) {
		this.client_FIO = name;
		this.client_id = 0;
		client_counts++;
	}
	
	//Конструктор класса со всеми параметрами.
	public customer(int id, String name) {
		this.client_id = id;
		this.client_FIO = name;
		client_counts++;
	}
	
	public void finalize() throws Throwable{
		client_counts--;
	}
		
	
	//Метод ввода.
	public void customer_input() {
		Scanner inpt = new Scanner(System.in, "Cp1251");
		System.out.print("Введите ФИО клиента: ");
		client_FIO = inpt.nextLine();
		System.out.print("Введите id клиента: ");
		client_id = inpt.nextInt();
	}

	//Метод вывода.
	public void customer_output() {
		System.out.println("ID клиента: " + client_id);
		System.out.println("ФИО клиента: " + client_FIO);
		System.out.println("Количество клиентов: " + client_counts);
	}

	public static int get_client_counts(){
		return client_counts;
	}

	public String trim_fio(){
		return client_FIO.trim();
	}

	public String toString() {
        return "Имя покупателя: " + client_FIO + "\nid покупателя: " + client_id;
    }
}