package WebCrawler.WebCrawler;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException
    {
        final WebCrawler crawler = new WebCrawler(new URL("http://i319728.hera.fhict.nl/catalog.php"));
    }

}
