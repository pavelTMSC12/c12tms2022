package readers;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reader {
    private String fullName;
    private Long id;//идентификационный номер
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public void takeBook(int number) {
        System.out.println(fullName + " взял " + number + " книги.");
    }

    public void takeBook(String[] books) {
        System.out.println(fullName + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(fullName + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
    }

    public void returnBook(int number) {
        System.out.println(fullName + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(fullName + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(fullName + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
    }


}
