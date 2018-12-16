package WebCrawler.WebCrawler;

import java.io.IOException;
import java.net.URL;

/**
 * This will be a console application for the testing purposes
 * From Main class it will be a call for webCrawler in order to get the data in a Tree structure
 * The class GoInTree will go in the tree to see the required data
 */
public class Main {

    public static void main(String[] args) throws IOException
    {
        final WebCrawler crawler = new WebCrawler(new URL("http://i319728.hera.fhict.nl/"));
        GoInTree.goInTree(crawler.getT());
    }

}
