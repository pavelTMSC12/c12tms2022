package p0;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.TEMP);
        System.out.println(Printable.COUNT);
        Printable book = new Book("");
        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = new Book("");
        for (Printable printable : printables) {
            printable.print();
        }

//        System.out.println(Printable.BOOK);
//        Printable.BOOK.setName("123");
//        System.out.println(Printable.BOOK);

    }
}
