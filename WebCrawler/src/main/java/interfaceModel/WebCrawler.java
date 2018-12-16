package interfaceModel;

import WebCrawler.WebCrawler.Tree;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public interface WebCrawler {
    public Tree getT();
    void crawl(final Set<URL> urls);
    Set<URL> initURLS(final URL startURL);

}
