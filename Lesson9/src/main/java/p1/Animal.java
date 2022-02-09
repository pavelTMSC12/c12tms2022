package p1;

public class Animal {//final
    protected final String name;//общая характеристика

    public Animal(String name) {
        System.out.println("Animal with name");
        this.name = name;
    }

//    public Animal() {
//        System.out.println("Animal");
//    }

    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    final void speak() { //private
        System.out.println("Я умею говорить");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
