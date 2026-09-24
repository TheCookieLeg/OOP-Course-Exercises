package Lecture2.Book;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int pageNumber;
    private int isbn;
    private String language;

    public Book(String title, String author, int publicationYear, int pageNumber) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pageNumber = pageNumber;
    }

    public Book(String title, String author, int publicationYear, int pageNumber, int isbn) {
        this(title, author, publicationYear, pageNumber);
        this.isbn = isbn;
    }

    public Book(String title, String author, int publicationYear, int pageNumber, String language) {
        this(title, author, publicationYear, pageNumber);
        this.language = language;
    }

    public Book(String title, String author, int publicationYear, int pageNumber, int isbn, String language) {
        this(title, author, publicationYear, pageNumber);
        this.isbn = isbn;
        this.language = language;
    }

    public double timeToRead(double pagePerMinute) {
        return pageNumber / pagePerMinute;

    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getPublicationYear() {return publicationYear;}
    public int getPageNumber() {return pageNumber;}
}
