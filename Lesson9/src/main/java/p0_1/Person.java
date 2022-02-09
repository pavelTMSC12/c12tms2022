package p0_1;

public class Person {
    private String name;
    private int age;
    private String sex;

    Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static Person.PersonBuilder builder() {
        return new Person.PersonBuilder();
    }

    public String toString() {
        return "Person(name=" + this.name + ", age=" + this.age + ", sex=" + this.sex + ")";
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private String sex;

        PersonBuilder() {
        }

        public Person.PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Person.PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person.PersonBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.age, this.sex);
        }

        public String toString() {
            return "Person.PersonBuilder(name=" + this.name + ", age=" + this.age + ", sex=" + this.sex + ")";
        }
    }
}
