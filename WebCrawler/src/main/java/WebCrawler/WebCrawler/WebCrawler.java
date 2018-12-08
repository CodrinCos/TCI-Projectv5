package WebCrawler.WebCrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;


public class WebCrawler {
    private final Set<URL> link;
    private final long startingTime;

    public WebCrawler(final URL startURL){
        this.link = new HashSet<>();
        this.startingTime = System.currentTimeMillis();
        crawl(initURLS(startURL));
    }

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
                        final URL discoveredURL = new URL(urlText);
                        newURLS.add(discoveredURL);
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