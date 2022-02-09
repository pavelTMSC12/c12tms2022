package p1;


public class CustomCow extends Cow {
    private String color;

    public CustomCow(String name) {
        super(name + "asdasd");
        System.out.println("Cow with name");
        setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public void speak() {
////        System.out.println("Му " + getName());
//        System.out.println("Му " + super.name);
//    }

    @Override
    public String toString() {
        return "CustomCow{" +
                "name='" + name + '\'' +
                '}';
    }

    //     protected -> package -> public
}
