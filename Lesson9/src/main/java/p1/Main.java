package p1;

public class Main {
    public static void main(String[] args) {

//        Cat animal = new Cat("Мурзик");
////        animal.setName("Мурзик");
//        animal.speak();
//
//        Cow cow = new Cow("Зорька");
//        System.out.println(cow);
////        cow.name = "Зорька234";
////        System.out.println(cow.name);
//        System.out.println(cow.getName());
//        cow.speak();
//
//        System.out.println("-----");
//        Cow cow2 = new Cow("Зорька");
////        cow2.setName("Зорька");
//        cow2.speak();


        Animal animal = new CustomCow("cow");
        animal.speak();//полиморфизм//speak для коровы
        System.out.println("!!" + animal.getName());//полиморфизм//speak для коровы
        System.out.println("!!" + animal.name);//Animal name

        System.out.println(((CustomCow) animal));

        if (animal instanceof CustomCow) {
            CustomCow customCow = (CustomCow) animal;
            customCow.info();
        } else if (animal instanceof Cat) {
            Cat animal1 = (Cat) animal;
        }


//        Animal animal1 = new Animal("animal");
//        animal1.speak();
//
//        Animal animal = createAnimal(1);
//        animal.speak();


//        Animal.speak();
//        Cat animal = new Cat();
//        Cow cow = new Cow();
//        Animal[] animals = new Animal[]{animal, new Dog(), cow};
//        for (Animal animal : animals) {
//            animal.speak();//полиморфизм
//        }

//        Animal cow1 = new Cow("Зорька");
////        cow1.name = "Зорька";
//        Animal animal = new Animal();
//        animal.name = "Default";
//        animal.setName("Default");
//
//        System.out.println(cow1.name);//полиморфизм не работает
//        System.out.println(animal.name);
//        System.out.println("----");
//        System.out.println(cow1.getName());//полиморфизм работает
//        System.out.println(animal.getName());

    }

    private static Animal createAnimal(int value) {
        switch (value) {
            case 0:
                return new Cat("Мурзик");
            case 1:
                return new Dog("Бельчик");
            case 2:
                return new Cow("Зорька");
        }
        return null;
    }
}
