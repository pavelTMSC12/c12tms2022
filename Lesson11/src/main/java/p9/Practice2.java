package p9;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("start");
        Person person2 = method();
        System.out.println(person2);//Three
    }

    private static Person method() {
        Person person = new Person();
        person.setName("One");
        try {
            person.setName("Two");
            return person;
        } finally {
            person.setName("Three");
        }
    }
}
