package by.tms.my_model;

public class Car {
    protected String name;
    private int year;
    private String color = "белый";
    public static final String TEMP; //= "c:\\temp";

    {
        System.out.println("блок инициализации");
        year = 2000;
        init();
    }

    static {
        System.out.println("static блок инициализации");
        TEMP = "c:\\temp";
    }

    public Car(String name, int year) {
        this("белый");
        this.name = name;
        this.year = year;
//        this.color = "белый";
    }

    private Car(String color) {
        init();
        this.color = color;
    }

    private void init() {
        System.out.println("инициализация полей");
    }

    public Car(int year, String color) {
        this(color);
        this.year = year;
    }

    //    public Car() {
//    }

    public String getColor() {
        return color;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getYear() {
        return year;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    @Override
    public String toString() {
        return "Car:" +
                "name='" + name + '\'' +
                ", year=" + year
                ;
    }


}
