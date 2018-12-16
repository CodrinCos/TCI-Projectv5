package WebCrawler.WebCrawler;

/**
 * This class represents the nodes from the tree.
 */
public class Node {
    //Common field from the MoviesNode,MusicNode,BooksNode
    private Node parent;
    private String link;
    private String category;
    private String name;
    private String genre;
    private String format;
    private int year;


    public Node(){}
    public Node(Node parent, String link){
        this.parent = parent;
        this.link = link;
    }

    public Node(Node parent, String link, String category, String name, String genre, String format, int year) {
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
    public int getYear() {
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
    public void setYear(int year) {
        this.year = year;
    }




}
