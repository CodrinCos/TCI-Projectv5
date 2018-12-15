package WebCrawler.WebCrawler;

public class MusicNode extends Node {
    private String artist;

    public MusicNode(String artist, Node parent, String link, String category, String name, String genre, String format, int year){
        super(parent, link, category, name, genre, format, year);

        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
