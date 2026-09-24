package Lecture2.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Farting: A general guide", "Mikkel Dissing", 2025, 300);

        System.out.printf("To read the book %s by %s, it would take %f minutes", book.getTitle(), book.getAuthor(), book.timeToRead(1));
    }
}
