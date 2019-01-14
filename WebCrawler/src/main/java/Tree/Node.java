package Tree;

import java.util.ArrayList;

/**
 * This class represents the nodes from the tree.
 */
public class Node {
    private Node parent;
    private String Url;
    private String link;
    private String category;
    private String name;
    private String genre;
    private String format;
    private String year;
    private ArrayList<String> authors;
    private String publisher;
    private String ISBN;
    private String director;
    private ArrayList<String> writer;
    private ArrayList<String> stars;
    private String artist;
    private String title;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getWriter() {
        return writer;
    }

    public void setWriter(ArrayList<String> writer) {
        this.writer = writer;
    }

    public ArrayList<String> getStars() {
        return stars;
    }

    public void setStars(ArrayList<String> stars) {
        this.stars = stars;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String>  authors) {
        this.authors = authors;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Node(){}
    public Node(Node parent, String link){
        this.parent = parent;
        this.link = link;
    }

    public Node(Node parent, String link, String category, String name, String genre, String format, String year) {
        this.parent = parent;
        this.link = link;
        this.category = category;
        this.name = name;
        this.genre = genre;
        this.format = format;
        this.year = year;
    }

    public Node getParent() {
        return parent;
    }
    public String getLink() {
        return link;
    }
    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }
    public String getFormat() {
        return format;
    }
    public String getYear() {
        return year;
    }



    public void setParent(Node parent) {
        this.parent = parent;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public void setYear(String year) {
        this.year = year;
    }




}
