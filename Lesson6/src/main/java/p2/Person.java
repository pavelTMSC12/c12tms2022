package p2;

import java.util.Random;


public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private String name;
    private int age;
    //enum is definitely the better option here
    private String sex = FEMALE;
    private Address address;

    public void setName(String name) {
        if (age > 18) {
            this.name = name;
        } else {
            System.out.println("когда 18 будет приходите");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
        System.out.println("Дефолтный конструктор");
    }

//    public Person(Address myAddress, int age, String name, String sex) {
//        this(age, name);
//        this.address = myAddress;
////        this.name = name;
////        this.age = age;
//        if (MALE.equals(sex) || FEMALE.equals(sex)) {
//            this.sex = sex;
//        }
//    }

    public Person(int age, String name) {
        this();
        this.age = age;
        this.name = name;
    }

    public Person(Address address, int age) {
        this.address = address;
        this.age = age;
    }

    public void info() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }

    //в пределах одного пакета или у наследника
    protected void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
