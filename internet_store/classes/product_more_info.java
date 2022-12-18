package classes;

public class product_more_info extends product {
    protected double weight;
    protected String data;
    public String day;
    public String month;
    public String year;
    
    // Конструктор клона объекта
    public product_more_info(product_more_info object){ // передача объекта конструктору
        super(object);
        weight = object.weight;
        day = object.day;
        month = object.month;
        year = object.year;
        data = object.data;
    }
    
    //Конструктор класса без параметров.
    public product_more_info(){
        super(0, "Товар0", 0);
        weight = 0;
        day = "0";
        month = "0";
        year = "0";
        data = "00.00.0000";
    }
    
    //Конструктор класса с несколькими параметрами.
    public product_more_info(double w, String d, String m, String y){
        super(0, "Товар0", 0);
        weight = w;
        day = d;
        month = m;
        year = y;
        data = day+ "." +month+ "." +year;
    }
    
    //Конструктор класса со всеми параметрами.
    public product_more_info(float price, String name, int count, double w, String d, String m, String y){
        super(price, name, count);
        weight = w;
        day = d;
        month = m;
        year = y;
        data = day+ "." +month+ "." +year;
	}

    public String get_date(){
        return data;
    }

    public double get_weight(){
        return weight;
    }
    
    
    
    

    public String toString() {
        return "Название продукта: " + product_name 
        + "\nКоличество продукта: " + product_count
        + "\nЦена продукта: " + product_price
        + "\nВес продукта: " + weight 
        + "\nДата доставки: " + data;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}