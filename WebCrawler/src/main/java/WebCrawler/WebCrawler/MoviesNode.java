package WebCrawler.WebCrawler;

public class MoviesNode extends Node {
    private String director;
    private String writers;
    private String stars;

    public MoviesNode(String director, String writers, String stars, Node parent, String link, String category, String name, String genre, String format, int year) {
        super(parent, link, category, name, genre, format, year);

        this.director = director;
        this.writers = writers;
        this.stars = stars;
    }

    public String getDirector() {
        return director;
    }
    public String getWriters() {
        return writers;
    }
    public String getStars() {
        return stars;
    }

    public void setDirector(String director) { this.director = director; }
    public void setWriters(String writers) {
        this.writers = writers;
    }
    public void setStars(String stars) {
        this.stars = stars;
    }
}
