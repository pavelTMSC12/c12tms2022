package p1;

public class Cow extends Animal {

    public String name;

//    public Cow() {
//        System.out.println("Cow");
//    }

    public Cow(String name) {
        super(name + "asdasd");
        System.out.println("Cow with name");
        setName(name);
    }

    public String info() {
        return "info";
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    void speak() {
////        System.out.println("Му " + getName());
//        System.out.println("Му " + super.name);
//    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                '}';
    }

    //  package->   protected   -> public
}
