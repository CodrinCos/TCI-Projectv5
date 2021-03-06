package WebCrawler.WebCrawler;

import Tree.Tree;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

/**
 * This class is going to search each link from the web-site and further on the
 * data it will be added in a tree.
 */
public class WebCrawler {
    private final Set<URL> link;
    private final long startingTime;
    private String bodyURL;
    private Tree t;

    public Tree getT() {
        return t;
    }

    public WebCrawler(final URL startURL){
        this.bodyURL=startURL.toString();
        this.link = new HashSet<>();
        this.startingTime = System.currentTimeMillis();
        crawl(initURLS(startURL));
    }

    /**
     * This method will search for each link in the website recursively
     * @param urls
     */
    private void crawl(final Set<URL> urls){
        urls.removeAll((this.link));
        if(!urls.isEmpty()){
            final Set<URL> newURLS = new HashSet<>();
            try{
                this.link.addAll(urls);
                for(final URL url : urls){
                    System.out.println("Time = " + (System.currentTimeMillis() - this.startingTime) + " connected to: " + url);
                    final Document document = Jsoup.connect(url.toString()).get();
                    final Elements linksOnPage = document.select("a[href]");
                    for(final Element element : linksOnPage){
                        final String urlText = element.attr("abs:href");
                        if (urlText.contains(bodyURL))
                        {
                            final URL discoveredURL = new URL(urlText);
                            newURLS.add(discoveredURL);
                        }
                    }
                }
            }catch (final Exception | Error ignored){

            }
            crawl(newURLS);
        }
    }

    private Set<URL> initURLS(final URL startURL){
        return Collections.singleton(startURL);
    }

}