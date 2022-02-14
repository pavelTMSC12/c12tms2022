package readers;

public class Main {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1L, "ИФ", "21.10.1999", "+806711111");
        Reader reader2 = new Reader("Иванов И.И.", 2L, "ИФ", "11.11.1997", "+806722222");
        Reader reader3 = new Reader("Сидоров А.А.", 3L, "ИФ", "05.04.2005", "+806733333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Задача трех тел", "Лю Цысинь");
        Book book2 = new Book("Дюна", "Фрэнк Герберт");
        Book book3 = new Book("Пикник на обочине", "Стругацкие");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        System.out.println();
        String[] bookNames = {"Космобиолухи, Громыко", "Java программирование, Шилдт"};
        reader2.takeBook(bookNames);
        System.out.println();
        reader3.takeBook(book1, book2, book3);
        System.out.println();

        reader1.returnBook(1);
        System.out.println();
        reader2.returnBook("Java программирование, Шилдт");
        System.out.println();
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader);
        }
        System.out.println();
    }
}
