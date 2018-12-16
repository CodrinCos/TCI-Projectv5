package WebCrawler.WebCrawler;

public class BooksNode extends Node {
    private String authors;
    private String publisher;
    private int isbn;

    public BooksNode(String authors, String publisher, int isbn, Node parent, String link, String category, String name, String genre, String format, int year) {
        super(parent, link, category, name, genre, format, year);

        this.authors = authors;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getAuthors() {
        return authors;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getISBN() {
        return isbn;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setISBN(int isbn) {
        this.isbn = isbn;
    }
}
